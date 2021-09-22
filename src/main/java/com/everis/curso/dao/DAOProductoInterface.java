package com.everis.curso.dao;

import com.everis.curso.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOProductoInterface extends JpaRepository<Producto, Integer> {
}
