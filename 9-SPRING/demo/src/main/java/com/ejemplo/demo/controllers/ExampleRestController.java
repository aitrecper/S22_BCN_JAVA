package com.ejemplo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/examplerest")
public class ExampleRestController {

    @GetMapping("/json")
    public Map<String, String> getJson() {
        // create a sample object
        Map<String, String> sampleObject = new HashMap<>();
        sampleObject.put("name", "John");
        sampleObject.put("age", "30");

        // return the object
        return sampleObject;
    }
}