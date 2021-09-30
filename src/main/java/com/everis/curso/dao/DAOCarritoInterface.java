package com.everis.curso.dao;

import com.everis.curso.model.Carrito;
import com.everis.curso.model.Producto;
import com.everis.curso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAOCarritoInterface extends JpaRepository<Carrito, Integer> {

    List<Carrito> findByUsuarioEquals(Usuario usuario);
    List<Carrito> findByProductoEquals(Producto producto);
}
