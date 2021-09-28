package com.everis.curso.dao;

import com.everis.curso.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOFormularioInterface extends JpaRepository<Formulario, Integer> {
}
