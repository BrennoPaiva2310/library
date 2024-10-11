package com.sesa.biblioteca.repository;

import com.sesa.biblioteca.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
