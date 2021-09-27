package com.everis.curso.service;

import com.everis.curso.model.Usuario;

import java.util.List;

public interface BSDUsuarioInterface {

    List<Usuario> listar();
    Usuario crearUsuario (Usuario usuario);
    Usuario modificarUsuario(Usuario usuario);
    void borrarUsuario(Integer id);
}
