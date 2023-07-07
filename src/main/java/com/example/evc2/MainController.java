package com.example.evc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("")
    public String alumno() {
        return "sm73762083 - Diaz Alvi";
    }

    @GetMapping("idat/codigo")
    public String codigo() {
        return "sm76108456";
    }

    @GetMapping("idat/nombre-completo")
    public String nombre() {
        return "Diaz Alvi";
    }

}
