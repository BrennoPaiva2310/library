package com.sesa.biblioteca.controller;

import com.sesa.biblioteca.model.DTO.PedidoDTO;
import com.sesa.biblioteca.model.Pedido;
import com.sesa.biblioteca.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getLivroById(@RequestParam(name = "id") Long id) {

        Optional<Pedido> pedido = pedidoService.findById(id);
        if (pedido.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pedido.get());
    }


    @PostMapping("/salvar")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoDTO pedidoDTO) {
        pedidoService.save(pedidoDTO);
        return ResponseEntity.ok("Pedido salvo com sucesso");

    }

    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> listar() {
        List<Pedido> pedidos = pedidoService.findAll();

        return ResponseEntity.ok(pedidos);
    }




}
