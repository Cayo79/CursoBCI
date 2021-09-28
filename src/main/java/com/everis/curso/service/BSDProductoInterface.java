package com.everis.curso.service;

import com.everis.curso.model.Producto;
import com.everis.curso.model.SPConsulta;
import com.everis.curso.model.SPConsultaNombre;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BSDProductoInterface {

    List<Producto> listarProducto();
    List<Producto> listarEstatusProducto(Boolean sts);
    Page<Producto> listarProductoDesc(Integer pageNumber);
    List<Producto> listarProductoNombre(String nombre);
    Producto crearProducto(Producto producto);
    void eliminarProducto(Integer id);

    List<SPConsulta> buscarConsulta(Integer id);
    List<SPConsultaNombre> buscarNombre(String name);
}
