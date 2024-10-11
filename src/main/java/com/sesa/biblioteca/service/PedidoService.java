package com.sesa.biblioteca.service;

import com.sesa.biblioteca.model.Cliente;
import com.sesa.biblioteca.model.DTO.PedidoDTO;
import com.sesa.biblioteca.model.Funcionario;
import com.sesa.biblioteca.model.Livro;
import com.sesa.biblioteca.model.Pedido;
import com.sesa.biblioteca.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    public void save(PedidoDTO pedidoDTO) {

        pedidoRepository.save(new Pedido(new Cliente(pedidoDTO.getIdCliente()), pedidoDTO.getIdLivro(), new Funcionario(pedidoDTO.getIdFuncionario())));
    }

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }


}
