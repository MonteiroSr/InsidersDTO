package com.exemplo.modelagem.insidersdto.service;

import com.exemplo.modelagem.insidersdto.model.Aluno;
import com.exemplo.modelagem.insidersdto.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public List<Aluno> listAll() {
        return repository.findAll();
    }

    public ResponseEntity<Aluno> create(Aluno aluno) {
        return new ResponseEntity<>(repository.save(aluno), HttpStatus.CREATED);
    }
}
