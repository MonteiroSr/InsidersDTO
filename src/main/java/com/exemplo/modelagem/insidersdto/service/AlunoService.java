package com.exemplo.modelagem.insidersdto.service;

import com.exemplo.modelagem.insidersdto.model.Aluno;
import com.exemplo.modelagem.insidersdto.model.DTO.AlunoDTO;
import com.exemplo.modelagem.insidersdto.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public List<AlunoDTO> listAll() {
        List<AlunoDTO> alunoDTOList = new ArrayList<>();

        repository.findAll()
                .forEach(aluno -> alunoDTOList.add(aluno.toDto()));

        return alunoDTOList;
    }

    public ResponseEntity<AlunoDTO> create(Aluno aluno) {
        return new ResponseEntity<>(repository.save(aluno).toDto(), HttpStatus.CREATED);
    }
}
