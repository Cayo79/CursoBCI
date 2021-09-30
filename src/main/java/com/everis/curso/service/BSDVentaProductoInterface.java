package com.everis.curso.service;

import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;

import java.util.List;

public interface BSDVentaProductoInterface {

    List<VentaProducto> listarVentaProducto();
    VentaProducto crearVentaProducto(VentaProducto ventaProducto);
    void eliminarVentaProducto(Integer id);

    List<VentaProducto> listarProductosVenta(Integer idVenta);
}
