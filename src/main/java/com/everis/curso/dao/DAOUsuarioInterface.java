package com.everis.curso.dao;

import com.everis.curso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOUsuarioInterface extends JpaRepository<Usuario, Integer> {
}
