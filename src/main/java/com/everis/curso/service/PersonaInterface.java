package com.everis.curso.service;

import com.everis.curso.repository.PersonaRepo;

import java.util.List;

public interface PersonaInterface {

    public void crearPersona(Integer id, String nombre);
    public void crearPersona(PersonaRepo personaRepo);
    public List<PersonaRepo> listarPersona();

    public void actualizarPersona(PersonaRepo personaRepo);
    public void borrarPersona(Integer id);
    public PersonaRepo buscar(Integer id);
}
