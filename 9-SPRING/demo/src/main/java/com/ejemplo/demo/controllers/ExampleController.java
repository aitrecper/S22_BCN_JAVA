package com.ejemplo.demo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/json")
    public ResponseEntity<String> getJson() {
        // create a sample object
        Map<String, String> sampleObject = new HashMap<>();
        sampleObject.put("name", "John");
        sampleObject.put("age", "30");

        // convert the object to JSON using Jackson
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(sampleObject);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // return the JSON
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(json, headers, HttpStatus.OK);
    }
}