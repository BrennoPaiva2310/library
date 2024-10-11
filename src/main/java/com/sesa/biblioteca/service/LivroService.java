package com.sesa.biblioteca.service;

import com.sesa.biblioteca.model.Livro;
import com.sesa.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    public void salvarLivro(Livro livro) {
        livroRepository.save(livro);
    }

    public List<Livro> findAllLivros() {
        return livroRepository.findAll();
    }
}
