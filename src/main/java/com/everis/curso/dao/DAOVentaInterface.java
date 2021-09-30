package com.everis.curso.dao;

import com.everis.curso.model.Usuario;
import com.everis.curso.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAOVentaInterface extends JpaRepository<Venta, Integer> {

    List<Venta> findByUsuarioEquals(Usuario usuario);
}
