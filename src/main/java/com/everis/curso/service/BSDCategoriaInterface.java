package com.everis.curso.service;

import com.everis.curso.model.Categoria;

import java.util.List;

public interface BSDCategoriaInterface {

    List<Categoria> listarCategoria();
    Categoria crearCategoria(Categoria categoria);
    void eliminarCategoria(Integer id);
}
