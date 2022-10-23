package com.angiema.kyara.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar() {
        return "Amor, estoy triunfando, hice mi primera pagina web con Spring Boot";

        }
    }


