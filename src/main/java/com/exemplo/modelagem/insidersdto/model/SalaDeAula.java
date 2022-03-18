package com.exemplo.modelagem.insidersdto.model;

import com.exemplo.modelagem.insidersdto.model.DTO.SalaDeAulaDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class SalaDeAula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "salaDeAula")
    private List<Aluno> listaAlunos = new ArrayList<>();

    public SalaDeAulaDTO toDto() {
        return new SalaDeAulaDTO(this);
    }
}
