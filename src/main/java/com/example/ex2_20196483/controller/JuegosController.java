package com.example.ex2_20196483.controller;

import com.example.ex2_20196483.entity.Juegos;
import com.example.ex2_20196483.repository.JuegosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

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

    @PostMapping(value="/api/orders/juegos/crear")
    public ResponseEntity<HashMap<String, Object>> crearJuego(
     @RequestBody Juegos juego ){
        HashMap<String, Object> responseMap = new HashMap<>();

        juegosRepository.save(juego);
        responseMap.put("result", "success");
        return ResponseEntity.status(HttpStatus.CREATED).body(responseMap);
    }


}
