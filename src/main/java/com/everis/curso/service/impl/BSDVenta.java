package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOVentaInterface;
import com.everis.curso.dao.DAOVentaProductoInterface;
import com.everis.curso.model.Usuario;
import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;
import com.everis.curso.service.BSDVentaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BSDVenta implements BSDVentaInterface {

    @Autowired
    private DAOVentaInterface daoVenta;

    @Autowired
    private DAOVentaProductoInterface bsdVentaProducto;

    @Override
    public List<Venta> listarVenta() {
        return daoVenta.findAll();
    }

    @Override
    public Venta crearVenta(Venta venta) {
        return daoVenta.save(venta);
    }

    @Override
    public void eliminarVenta(Integer id) {
        daoVenta.deleteById(id);
    }

    @Override
    public List<Venta> listarUsuario(Integer idUsuario) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);

        return daoVenta.findByUsuarioEquals(usuario);
    }

    @Override
    public List<VentaProducto> listaProductos(Integer idUsuario) {
        List<Venta> ventas = listarUsuario(idUsuario);
        List<VentaProducto> prod = new ArrayList<>();
        ventas.forEach(ven -> {
            prod.addAll(bsdVentaProducto.findByVentaEquals(ven));
        });
        return prod;
    }
}
