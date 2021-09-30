package com.everis.curso.service;

import com.everis.curso.model.Carrito;
import com.everis.curso.model.Venta;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BSDCarritoInterface {

    List<Carrito> listarCarrito();

    Carrito crearCarrito(Carrito carrito);

    void eliminarCarrito(Integer id);

    List<Carrito> buscarCarritoUsuario(Integer idUsuario);

    List<Carrito> buscarCarritoProducto(Integer idProducto);

    Venta comprar(List<Carrito> listaCarrito);
}
