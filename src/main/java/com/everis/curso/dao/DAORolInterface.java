package com.everis.curso.dao;

import com.everis.curso.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAORolInterface extends JpaRepository<Rol, Integer> {
}
