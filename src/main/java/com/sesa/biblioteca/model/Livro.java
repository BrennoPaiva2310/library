package com.sesa.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String editora;

    @Column(nullable = false)
    private Long quantidade;

    public Livro(String nome, String autor, String editora, Long quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    public Livro() {

    }

    public Livro(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
