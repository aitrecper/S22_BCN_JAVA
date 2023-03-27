package com.ejemplo.demo.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PT17Controller {

    @RequestMapping("/welcome")
    public String ejemplo(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        // hacer algo con el parámetro obtenido
        return "Bienvenido " + name + " " + surname + "!";
    }

    @RequestMapping("/welcome2")
    public ObjectNode ejemplo2(HttpServletRequest request) {
        String name ="", surname ="";
        name = request.getParameter("name");
        surname = request.getParameter("surname");
        if(name.equals("")){
            name = "desconocido";
        }
        if(surname.equals("")){
            surname = "desconocido";
        }
        // hacer algo con el parámetro obtenido
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("name", name);
        node.put("surname", surname);
        return node;
    }
}
