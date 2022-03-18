package com.exemplo.modelagem.insidersdto.controller;

import com.exemplo.modelagem.insidersdto.model.DTO.SalaDeAulaDTO;
import com.exemplo.modelagem.insidersdto.model.SalaDeAula;
import com.exemplo.modelagem.insidersdto.service.SalaDeAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaDeAulacontroller {

    @Autowired
    SalaDeAulaService service;

    @GetMapping
    public List<SalaDeAulaDTO> listAll() {
        return service.listAll();
    }

    @PostMapping("/nova")
    public ResponseEntity<SalaDeAulaDTO> create(@RequestBody SalaDeAula salaDeAula) {
        return service.create(salaDeAula);
    }
}
