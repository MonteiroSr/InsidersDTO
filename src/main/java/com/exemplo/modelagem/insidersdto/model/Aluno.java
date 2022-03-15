package com.exemplo.modelagem.insidersdto.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private SalaDeAula salaDeAula;
}
