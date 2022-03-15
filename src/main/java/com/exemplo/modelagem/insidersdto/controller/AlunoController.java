package com.exemplo.modelagem.insidersdto.controller;

import com.exemplo.modelagem.insidersdto.model.Aluno;
import com.exemplo.modelagem.insidersdto.model.DTO.AlunoDTO;
import com.exemplo.modelagem.insidersdto.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService service;

    @GetMapping
    public List<AlunoDTO> listAll() {
        return service.listAll();
    }

    @PostMapping("/novo")
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
        return service.create(aluno);
    }
}
