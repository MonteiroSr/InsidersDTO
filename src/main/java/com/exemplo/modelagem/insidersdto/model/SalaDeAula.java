package com.exemplo.modelagem.insidersdto.model;

import lombok.Data;

import javax.persistence.*;
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
    private List<Aluno> listaAlunos;
}
