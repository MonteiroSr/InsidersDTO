package com.exemplo.modelagem.insidersdto.model.DTO;

import com.exemplo.modelagem.insidersdto.model.SalaDeAula;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SalaDeAulaDTO {

    String nomeSala;

    List<String> nomeAlunos = new ArrayList<>();

    public SalaDeAulaDTO(SalaDeAula salaDeAula) {
        this.nomeSala = salaDeAula.getNome();

        salaDeAula.getListaAlunos()
                .forEach(aluno -> this.nomeAlunos.add(aluno.getNome()));
    }
}
