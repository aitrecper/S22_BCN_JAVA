package com.ejemplo.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class RandomController {

    @ResponseBody
    @RequestMapping("/random")
    public ModelAndView random() {
        ModelAndView modelAndView = new ModelAndView();

        Random random = new Random();

        int randomNumber = random.nextInt(2);
        if(randomNumber == 0){
            modelAndView.setViewName("test.html");
            modelAndView.setStatus(HttpStatus.OK);
        }else{
            modelAndView.setViewName("about.html");
            modelAndView.setStatus(HttpStatus.NOT_FOUND);
        }

        return modelAndView;
    }
}
