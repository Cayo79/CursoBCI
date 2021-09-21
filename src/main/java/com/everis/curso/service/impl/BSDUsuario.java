package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOUsuarioInterface;
import com.everis.curso.model.Usuario;
import com.everis.curso.service.BSDUsuarioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BSDUsuario implements BSDUsuarioInterface {

    @Autowired
    DAOUsuarioInterface daoUsuario;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return daoUsuario.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return daoUsuario.save(usuario);
    }

    @Override
    public void borrarUsuario(Integer id) {
        daoUsuario.deleteById(id);
    }
}
