package com.everis.curso.service.impl;

import com.everis.curso.dao.DAORolInterface;
import com.everis.curso.model.Rol;
import com.everis.curso.service.BSDRolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDRol implements BSDRolInterface {
    @Autowired
    DAORolInterface daoRol;

    @Override
    public List<Rol> listarRol() {
        return daoRol.findAll();
    }

    @Override
    public Rol crearRol(Rol rol) {
        return daoRol.save(rol);
    }

    @Override
    public void eliminarRol(Integer id) {
        daoRol.deleteById(id);
    }
}
