package com.everis.curso.dao;

import com.everis.curso.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOCategoriaInterface extends JpaRepository<Categoria, Integer> {
}
