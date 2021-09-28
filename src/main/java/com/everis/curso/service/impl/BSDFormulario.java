package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOFormularioInterface;
import com.everis.curso.model.Formulario;
import com.everis.curso.service.BSDFormularioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDFormulario implements BSDFormularioInterface {

    @Autowired
    private DAOFormularioInterface daoFormulario;

    @Override
    public List<Formulario> listarFormulario() {
        return daoFormulario.findAll();
    }

    @Override
    public Formulario crearFormulario(Formulario formulario) {
        return daoFormulario.save(formulario);
    }

    @Override
    public void eliminarFormulario(Integer id) {
        daoFormulario.deleteById(id);
    }
}
