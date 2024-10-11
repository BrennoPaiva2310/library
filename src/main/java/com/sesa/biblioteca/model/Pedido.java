package com.sesa.biblioteca.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_pedido")
public class Pedido {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id",nullable = false)
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "livro_id")
    private List<Livro> livro;

    @ManyToOne
    @JoinColumn(name = "funcionario_id" ,nullable = false)

    private Funcionario funcionario;

    public Pedido() {
    }

    public Pedido(Long id) {
        this.id = id;
    }

    public Pedido(Cliente cliente, List<Livro> livro, Funcionario funcionario) {
        this.cliente = cliente;
        this.livro = livro;
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

}
