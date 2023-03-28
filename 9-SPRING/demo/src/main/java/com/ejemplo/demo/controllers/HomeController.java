package com.ejemplo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<String> getAllUsers() {

        final String QUERY1 = "SELECT * FROM users;";

        List<Map<String, Object>> result = jdbcTemplate.queryForList(QUERY1);

        List<String> userList = new ArrayList<String>();

        for(Map<String, Object> row : result)
            userList.add(row.get("nombre").toString());

        return userList;
    }

}
