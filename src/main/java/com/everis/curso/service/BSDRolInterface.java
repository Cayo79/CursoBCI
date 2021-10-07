package com.everis.curso.service;

import com.everis.curso.model.Rol;

import java.util.List;

public interface BSDRolInterface {

    List<Rol> listarRol();
    Rol crearRol(Rol rol);
    void eliminarRol(Integer id);
}
