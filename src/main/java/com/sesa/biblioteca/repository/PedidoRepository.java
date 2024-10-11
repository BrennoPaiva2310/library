package com.sesa.biblioteca.repository;

import com.sesa.biblioteca.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
