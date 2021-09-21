package com.everis.curso.service;

import com.everis.curso.model.Usuario;

public interface BSDUsuarioInterface {

    Usuario crearUsuario (Usuario usuario);
    Usuario modificarUsuario(Usuario usuario);
    void borrarUsuario(Integer id);
}
