package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOCategoriaInterface;
import com.everis.curso.model.Categoria;
import com.everis.curso.service.BSDCategoriaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDCategoria implements BSDCategoriaInterface {
    @Autowired
    DAOCategoriaInterface daoCategoria;

    @Override
    public List<Categoria> listarCategoria() {
        return daoCategoria.findAll();
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return daoCategoria.save(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        daoCategoria.deleteById(id);
    }
}
