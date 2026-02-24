package com.alquilatusvehiculos.alquila_tus_vehiculos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    /**
     * Página de bienvenida. URL: GET http://localhost:8080/
     */
    @GetMapping
    public String index(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a AlquilaTusVehiculos!");
        model.addAttribute("equipo", "NoobDevs");
        return "index";
    }

    /**
     * Hello World para verificar que el servidor responde. URL: GET
     * http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("mensaje", "¡Hello World! El sistema AlquilaTusVehiculos está funcionando correctamente.");
        return "hello";
    }
}
