package com.sesa.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "tb_funcionario")
public class Funcionario extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Funcionario() {
    }

    public Funcionario(Long id) {
        this.id = id;
    }



    public Funcionario(String nome, String cpf, String dataNascimento, Boolean ativo, Long id) {
        super(nome, cpf, dataNascimento, ativo);
        this.id = id;
    }
}
