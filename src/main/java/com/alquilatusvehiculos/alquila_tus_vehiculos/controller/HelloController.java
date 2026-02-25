package com.alquilatusvehiculos.alquila_tus_vehiculos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    /**
     * Página de bienvenida. URL: GET http://localhost:8080/
     */
    @GetMapping
    public String index() {
        return "¡Bienvenido a AlquilaTusVehiculos! -  NoobDevs";
    }

    /**
     * Hello World para verificar que el servidor responde. URL: GET
     * http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String hello() {
        return "¡Hello World! El sistema AlquilaTusVehiculos está funcionando correctamente.";
    }
}
