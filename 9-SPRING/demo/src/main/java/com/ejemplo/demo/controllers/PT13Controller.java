package com.ejemplo.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class PT13Controller {

    @RequestMapping("/pt13")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String pt13() {
        return "about.html";
    }
}
