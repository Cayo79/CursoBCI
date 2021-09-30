package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOVentaProductoInterface;
import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;
import com.everis.curso.service.BSDVentaProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDVentaProducto implements BSDVentaProductoInterface {

    @Autowired
    private DAOVentaProductoInterface daoVentaProducto;

    @Override
    public List<VentaProducto> listarVentaProducto() {
        return daoVentaProducto.findAll();
    }

    @Override
    public VentaProducto crearVentaProducto(VentaProducto ventaProducto) {
        return daoVentaProducto.save(ventaProducto);
    }

    @Override
    public void eliminarVentaProducto(Integer id) {
        daoVentaProducto.deleteById(id);
    }

    @Override
    public List<VentaProducto> listarProductosVenta(Integer idVenta) {
        Venta venta = new Venta();
        venta.setIdVenta(idVenta);

        return daoVentaProducto.findByVentaEquals(venta);
    }
}
