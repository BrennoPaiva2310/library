package com.sesa.biblioteca.service;

import com.sesa.biblioteca.model.Cliente;
import com.sesa.biblioteca.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {


    private ClienteRepository clienteRepository;

    ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public  Optional<Cliente> getClienteById(Long id) {

       return clienteRepository.findById(id);
    }

    public Cliente saveCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }
}
