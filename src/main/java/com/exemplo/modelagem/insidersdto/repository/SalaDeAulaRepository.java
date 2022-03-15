package com.exemplo.modelagem.insidersdto.repository;

import com.exemplo.modelagem.insidersdto.model.SalaDeAula;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalaDeAulaRepository extends CrudRepository<SalaDeAula, Long> {
    List<SalaDeAula> findAll();
}
