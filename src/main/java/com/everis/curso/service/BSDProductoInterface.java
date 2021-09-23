package com.everis.curso.service;

import com.everis.curso.model.Producto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BSDProductoInterface {

    List<Producto> listarProducto();
    Page<Producto> listarProductoDesc(Integer pageNumber);
    List<Producto> listarProductoNombre(String nombre);
    Producto crearProducto(Producto producto);
    void eliminarProducto(Integer id);
}
