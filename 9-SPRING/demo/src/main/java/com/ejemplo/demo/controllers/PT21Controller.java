package com.ejemplo.demo.controllers;

import com.ejemplo.demo.Persona;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pt21")
public class PT21Controller {

    @GetMapping(name = "", produces = "application/json")
    public String getMethod() {
        LOGGER.info("Method GET");
        return new Persona("Aitor", "Recio Pérez",28).toJson();
    }

    final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger();

    @PostMapping("")
    public String postMethod( @RequestBody Persona persona) {

        LOGGER.info("Method POST");
        return persona.toJson();
  }

  @PutMapping("")
  public String putMethod( @RequestBody Persona persona) {
        LOGGER.info("Method PUT");
        return "El objeto se ha introducido correctamente junto a los atributos del objeto.";
  }

  @DeleteMapping("/{id}")
  public String deleteMethod(@PathVariable String id, @RequestBody Persona persona) {
        LOGGER.info("Method DELETE");
        return "El objeto " + id + " se ha eliminado correctamente.";
  }
}
