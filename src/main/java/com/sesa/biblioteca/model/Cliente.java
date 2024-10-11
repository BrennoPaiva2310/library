package com.sesa.biblioteca.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_cliente")
public class Cliente extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Cliente(Long id) {
        this.id = id;
    }


    public Cliente(String nome, String cpf, String dataNascimento, Boolean ativo) {
        super(nome, cpf, dataNascimento, ativo);
    }


    public Cliente() {

    }
}
