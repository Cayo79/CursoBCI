package com.everis.curso.service.impl;

import com.everis.curso.repository.PersonaRepo;
import com.everis.curso.service.PersonaInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Persona implements PersonaInterface {

    private List<PersonaRepo> listado = new ArrayList();

    @Override
    public void crearPersona(Integer id, String nombre) {

        PersonaRepo personaRepo = new PersonaRepo();
        personaRepo.setId(id);
        personaRepo.setName(nombre);

        listado.add(personaRepo);
    }

    @Override
    public void crearPersona(PersonaRepo personaRepo) {
        listado.add(personaRepo);
    }

    @Override
    public List<PersonaRepo> listarPersona() {
        return listado;
    }

    @Override
    public void actualizarPersona(PersonaRepo personaRepo) {

        listado.forEach( actual -> {
            if(actual.getId() == personaRepo.getId()){
                actual.setName(personaRepo.getName());
            }
        });
    }

    @Override
    public void borrarPersona(Integer id) {
        int i;
        for(i=0; i<listado.size(); i++){
            if(listado.get(i).getId() == id) {
                break;
            }
        }
        listado.remove(i);
    }

    @Override
    public PersonaRepo buscar(Integer id) {
        return null;
    }
}
