package com.ejemplo.demo.controllers;

import com.ejemplo.demo.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UsersController {
    /*
     * Injectamos el JdbcTemplate mediante a la anotación Autowired (mediante a la
     * inyección de dependencias)
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Operation(description = "Get all users from the database",summary = "Get all users")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        // La query que ejecutaremos/lanzaremos jdbcTemplate
        final String QUERY1 = "SELECT * FROM USERS;";

        // Guardamos el resultado de la query
        List<Map<String, Object>> results = jdbcTemplate.queryForList(QUERY1);

        // Creamos el userList en el que guardaremos los usuarios
        List<User> userList = new ArrayList<User>();

        // Recorremos los resultados
        for (Map<String, Object> row : results) {
            // Creramos el usuario
            User user = new User();
            // Setteamos el campo ID
            user.setId(((Integer) row.get("ID")).longValue());
            // Setteamos el campo NAME
            user.setName((String) row.get("NOMBRE"));
            // Setteamos el campo SURNAME
            user.setSurname((String) row.get("APELLIDOS"));
            // Una vez guardados los valores, añadimos el elemento a la lista de Users
            userList.add(user);
        }

        return userList;// Devolvemos el listado
    }

    @Operation(summary = "Get a user", description = "Get a user from the database")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity getUser(@PathVariable("id") int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql, new Object[] {id}, new UserRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe un usuario con dicho ID");
        }
        return ResponseEntity.ok(user);
    }

    @Operation(summary = "Add a new user", description = "Add a new user to the database")
    @RequestMapping(value = "/add/users", method = RequestMethod.POST)
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        // La query que ejecutaremos/lanzaremos jdbcTemplate
        try {
            String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, user.getName());
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Operation(summary = "Delete a user", description = "Delete a user from the database")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable int id, @RequestBody User user) {
        int rowsAffected = jdbcTemplate.update("DELETE FROM users WHERE id=?", id);
        if (rowsAffected == 1) {
            return ResponseEntity.ok("User with id " + id + " deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Update a user", description = "Update a user in the database")
    @RequestMapping(value = "/users/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user) {

        int rowsAffected = jdbcTemplate.update(
                "UPDATE users SET name = ?, surname = ? WHERE id = ?",
                user.getName(), user.getSurname(), id
        );
        if (rowsAffected == 1) {
            return ResponseEntity.ok("Usuario actualizado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el usuario con id " + id);
        }
    }

    public class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("nombre"));
            user.setSurname(rs.getString("apellidos"));
            return user;
        }
    }
}