package com.everis.curso.dao;

import com.everis.curso.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOEmpleadoInterface extends JpaRepository<Empleado, Integer> {
}
