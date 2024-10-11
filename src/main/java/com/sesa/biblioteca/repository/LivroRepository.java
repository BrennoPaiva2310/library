package com.sesa.biblioteca.repository;

import com.sesa.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
