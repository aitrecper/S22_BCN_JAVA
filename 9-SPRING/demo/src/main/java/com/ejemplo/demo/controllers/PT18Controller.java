package com.ejemplo.demo.controllers;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class PT18Controller {

    Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger();


    @RequestMapping("/pt18")
    public String pt18(@RequestParam(required = false) Map<String,String> allParams) {


        if(allParams.isEmpty())
            LOGGER.info("La zona de parámetro está vacía ¡No has enviado nada!");
        else
            allParams.forEach((k,v) -> LOGGER.info(k + ": " + v));

        return "about.html";
    }
}
