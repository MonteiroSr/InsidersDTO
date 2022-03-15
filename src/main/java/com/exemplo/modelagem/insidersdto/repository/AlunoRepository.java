package com.exemplo.modelagem.insidersdto.repository;

import com.exemplo.modelagem.insidersdto.model.Aluno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findAll();
}
