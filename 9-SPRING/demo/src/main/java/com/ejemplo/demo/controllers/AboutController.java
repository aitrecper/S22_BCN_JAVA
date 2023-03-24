package com.ejemplo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class AboutController {

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("about.html");

        return mv;
    }
}
