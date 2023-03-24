package com.ejemplo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @GetMapping("/contact")
    ModelAndView contact() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contact.html");

        return mv;
    }
}
