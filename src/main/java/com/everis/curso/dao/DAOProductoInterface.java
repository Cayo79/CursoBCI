package com.everis.curso.dao;

import com.everis.curso.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAOProductoInterface extends JpaRepository<Producto, Integer> {

    List<Producto> findByNombreEquals(String nombre);
    List<Producto> findByNombreLike (String nombre);
    List<Producto> findByNombreContains(String nombre);
    List<Producto> findByEstatusEquals(Boolean sts);
}
