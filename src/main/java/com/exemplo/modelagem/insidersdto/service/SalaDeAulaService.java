package com.exemplo.modelagem.insidersdto.service;

import com.exemplo.modelagem.insidersdto.model.SalaDeAula;
import com.exemplo.modelagem.insidersdto.repository.SalaDeAulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaDeAulaService {

    @Autowired
    SalaDeAulaRepository repository;

    public List<SalaDeAula> listAll() {
        return repository.findAll();
    }

    public ResponseEntity<SalaDeAula> create(SalaDeAula salaDeAula) {
        return new ResponseEntity<>(repository.save(salaDeAula), HttpStatus.CREATED);
    }
}
