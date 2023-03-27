package com.ejemplo.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PT14Controller {

    @RequestMapping("/apiVersion/hacercafe")
    @ResponseStatus(HttpStatus.OK)
    public String hacerCafe() {
        return "hacerCafe";
    }

    @RequestMapping("/apiVersion/hacerte")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String hacerTe() {
        return "Soy una tetera!";
    }

    @RequestMapping("/apiVersion/notfound")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "Not Found";
    }
}
