package com.senai.apiValidation.controller;

import com.senai.apiValidation.dto.EventoDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @PostMapping
    public ResponseEntity<String> criarEvento(@Valid @RequestBody EventoDTO evento) {
        return ResponseEntity.status(HttpStatus.CREATED).body("O evento foi cadastrado!");
    }
}