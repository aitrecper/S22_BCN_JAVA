package com.ejemplo.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PT19Controller {

    @GetMapping("/discoteca")
    public String discoteca(HttpServletRequest request) {
        int age = Integer.parseInt(request.getParameter("age"));
        if (age < 18)
            return "¡No puedes pasar tronc@!";
        else
            return "¡Puedes pasar!";
    }

    @GetMapping("/caraOCruz")
    public String caraOCruz(HttpServletRequest request) {
        String coin = request.getParameter("coin").toLowerCase();

        Random random = new Random();
        int randomNumber = random.nextInt(2);

        if(coin.equals("cara") && randomNumber == 0) return "Has ganado!";
        else if(coin.equals("cara") && randomNumber == 1) return "Has perdido!";
        else if(coin.equals("cruz") && randomNumber == 1) return "Has ganado!";
        else return "Has perdido!";
    }
}
