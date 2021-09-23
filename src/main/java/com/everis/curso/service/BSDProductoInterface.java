package com.everis.curso.service;

import com.everis.curso.model.Producto;

import java.util.List;

public interface BSDProductoInterface {

    List<Producto> listarProducto();
    List<Producto> listarProductoNombre(String nombre);
    Producto crearProducto(Producto producto);
    void eliminarProducto(Integer id);
}
