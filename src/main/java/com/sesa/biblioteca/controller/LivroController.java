package com.sesa.biblioteca.controller;

import com.sesa.biblioteca.model.Livro;
import com.sesa.biblioteca.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivroById(@PathVariable(name = "id") Long id) {
        Optional<Livro> livro = livroService.findById(id);

        if (livro.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(livro.get());
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvarLivro(@RequestBody Livro livro) {
        livroService.salvarLivro(livro);
        return ResponseEntity.ok("Livro salvo com sucesso!");
    }

    @GetMapping("/livros")
    public ResponseEntity<List<Livro>> listar() {
        List<Livro> livros = livroService.findAllLivros();

        return ResponseEntity.ok(livros);
    }





}
