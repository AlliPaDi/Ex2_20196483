package com.example.ex2_20196483.controller;

import com.example.ex2_20196483.entity.Juegos;
import com.example.ex2_20196483.repository.JuegosRepository;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@EnableWebSecurity

@RestController
public class JuegosController {

    final JuegosRepository juegosRepository;

    public JuegosController(JuegosRepository juegosRepository) {
        this.juegosRepository = juegosRepository;
    }

    @GetMapping("api/orders/juegos")
    public List<Juegos> listarJuegos(){
        return juegosRepository.findAll();
    }


}
