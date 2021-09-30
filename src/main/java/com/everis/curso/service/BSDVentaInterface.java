package com.everis.curso.service;

import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;

import java.util.List;

public interface BSDVentaInterface {

    List<Venta> listarVenta();
    Venta crearVenta(Venta venta);
    void eliminarVenta(Integer id);

    List<Venta> listarUsuario(Integer idUsuario);
    List<VentaProducto> listaProductos(Integer idUsuario);
}
