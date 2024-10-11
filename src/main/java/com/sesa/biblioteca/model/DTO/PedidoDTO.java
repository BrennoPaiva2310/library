package com.sesa.biblioteca.model.DTO;

import com.sesa.biblioteca.model.Livro;

import java.util.List;

public class PedidoDTO {

    private Long idCliente;
    private List<Livro> idLivro;
    private Long idFuncionario;

    public PedidoDTO(Long idCliente, List<Livro> idLivro, Long idFuncionario) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.idFuncionario = idFuncionario;
    }

    public PedidoDTO() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<Livro> getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(List<Livro> idLivro) {
        this.idLivro = idLivro;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
