package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOCarritoInterface;
import com.everis.curso.dao.DAOVentaInterface;
import com.everis.curso.dao.DAOVentaProductoInterface;
import com.everis.curso.model.*;
import com.everis.curso.service.BSDCarritoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BSDCarrito implements BSDCarritoInterface {

    @Autowired
    private DAOCarritoInterface daoCarrito;

    @Autowired
    private DAOVentaInterface daoVenta;

    @Autowired
    private DAOVentaProductoInterface daoVentaProducto;

    @Override
    public List<Carrito> listarCarrito() {
        return daoCarrito.findAll();
    }

    @Override
    public Carrito crearCarrito(Carrito carrito) {
        return daoCarrito.save(carrito);
    }

    @Override
    public void eliminarCarrito(Integer id) {
        daoCarrito.deleteById(id);
    }

    @Override
    public List<Carrito> buscarCarritoUsuario(Integer idUsuario) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);

        return daoCarrito.findByUsuarioEquals(usuario);
    }

    @Override
    public List<Carrito> buscarCarritoProducto(Integer idProducto) {
        Producto prod = new Producto();
        prod.setIdProducto(idProducto);

        return daoCarrito.findByProductoEquals(prod);
    }

    @Override
    public Venta comprar(List<Carrito> listaCarrito) {
        Venta venta = new Venta();
        Carrito car = listaCarrito.get(0);
        venta.setUsuario(car.getUsuario());
        venta.setFechaVenta(new Date());
        Venta newVenta = daoVenta.save(venta);

        listaCarrito.forEach(carrito -> {
            if (carrito.getEstatus()) {
                VentaProducto ventaProducto = new VentaProducto();
                ventaProducto.setVenta(newVenta);
                ventaProducto.setProducto(carrito.getProducto());
                ventaProducto.setCantidad(carrito.getCantidad());
                ventaProducto.setPrecioUnitario(carrito.getProducto().getPrecio());
                daoVentaProducto.save((ventaProducto));
            }
        });

        return newVenta;
    }
}
