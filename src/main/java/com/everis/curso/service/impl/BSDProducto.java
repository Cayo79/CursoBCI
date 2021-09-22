package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOProductoInterface;
import com.everis.curso.model.Producto;
import com.everis.curso.service.BSDProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDProducto implements BSDProductoInterface {
    @Autowired
    private DAOProductoInterface daoProducto;

    @Override
    public List<Producto> listarProducto() {
        return daoProducto.findAll();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return daoProducto.save(producto);
    }

    @Override
    public void eliminarProducto(Integer id) {
        daoProducto.deleteById(id);
    }
}
