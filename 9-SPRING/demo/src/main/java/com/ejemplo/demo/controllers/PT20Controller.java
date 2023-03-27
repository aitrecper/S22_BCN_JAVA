package com.ejemplo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PT20Controller {

    @GetMapping("/{num}/factura")
    public String factura(@PathVariable String num) {
        int num2 = Integer.parseInt(num);
        if(num == null){
            throw new IllegalArgumentException("El numero no puede ser nulo");
        } else if (num.isEmpty()) {
            return "Has introducido un numero vacio";
        }else if (num2 %2==0) {
            return "El numero es par";
        }else {
            return "El numero es impar";
        }
    }
}
