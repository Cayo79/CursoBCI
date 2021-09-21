package com.everis.curso.dao;

import com.everis.curso.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAODepartamentoInterface extends JpaRepository<Departamento, Integer> {
}
