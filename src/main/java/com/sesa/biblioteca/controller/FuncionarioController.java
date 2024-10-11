package com.sesa.biblioteca.controller;

import com.sesa.biblioteca.model.Funcionario;
import com.sesa.biblioteca.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/funcionario" )
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getFuncionarioById(@PathVariable(name = "id") Long id) {

        Optional<Funcionario> funcionario = funcionarioService.getFuncionarioById(id);

        if (funcionario.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(funcionario.get());
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return ResponseEntity.ok("Funcionario Salvo com sucesso!");
    }

    @GetMapping("/funcionarios")
    public ResponseEntity<List<Funcionario>> listar() {
        List<Funcionario> funcionarios = funcionarioService.findAllFuncionarios();

        return ResponseEntity.ok(funcionarios);
    }
}
