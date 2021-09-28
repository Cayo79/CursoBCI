package com.everis.curso.service;

import com.everis.curso.model.Formulario;

import java.util.List;

public interface BSDFormularioInterface {

    List<Formulario> listarFormulario();
    Formulario crearFormulario(Formulario formulario);
    void eliminarFormulario(Integer id);
}
