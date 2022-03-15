package com.exemplo.modelagem.insidersdto.model.DTO;

import com.exemplo.modelagem.insidersdto.model.Aluno;
import lombok.Data;

@Data
public class AlunoDTO {

    private String nome;
    private String nomeSala;

    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.nomeSala = aluno.getSalaDeAula().getNome();
    }
}
