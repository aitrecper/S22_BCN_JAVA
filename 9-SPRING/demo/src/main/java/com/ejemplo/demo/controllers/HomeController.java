package com.ejemplo.demo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ejemplo.demo.TextToJSON;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/")
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("test.html");
//
//        return modelAndView;
//    }
//    public TextToJSON test() {
//        TextToJSON textToJson = new TextToJSON("test.html");
//        return textToJson;
//    }

//    @RequestMapping(path = "/", produces = "application/json")
//    public String index() {
//        return "{\"page\": \"index.html\"}";
//    }

//    public ObjectNode index() {
//
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectNode node = mapper.createObjectNode();
//        node.put("message", "Hello World!");
//        return node;
//    }

    public ResponseEntity<String> index() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>("{\"test\": \"Hello World with ResponseEntity\"}",headers, HttpStatus.OK);
    }
}
