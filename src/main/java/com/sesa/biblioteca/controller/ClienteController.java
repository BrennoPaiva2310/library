package com.sesa.biblioteca.controller;

import com.sesa.biblioteca.model.Cliente;
import com.sesa.biblioteca.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listar(@PathVariable(name = "id") Long id) {

        Optional<Cliente>cliente = clienteService.getClienteById(id);

        return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvar(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return ResponseEntity.ok("Cliente salvo com sucesso");
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> clientes = clienteService.findAllClientes();

        return ResponseEntity.ok(clientes);
    }


}
