package com.everis.curso.controller;

import com.everis.curso.repository.EjemploLombok;
import com.everis.curso.repository.PersonaRepo;
import com.everis.curso.service.PersonaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Bienvenida {

    @Autowired
    private PersonaInterface personaInt;
    private Integer ident = 0;

    @GetMapping("/saludos")
    public String saludos(@RequestParam(name="name", required=false, defaultValue ="Mundo") String name, Model model){
        model.addAttribute("name", name);

        personaInt.crearPersona(ident,name);
        ident++;
        model.addAttribute("listado", personaInt.listarPersona());

        return "saludo";
    }

    @PostMapping("/actualiza")
    public String actualizar(@RequestBody PersonaRepo personaRepo, Model model){
        model.addAttribute("name", personaRepo.getName());
        personaInt.actualizarPersona(personaRepo);
        model.addAttribute("listado", personaInt.listarPersona());

        return "saludo";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrar(@PathVariable Integer id, Model model){
        model.addAttribute("name", id);
        personaInt.borrarPersona(id);
        model.addAttribute("listado", personaInt.listarPersona());

        return "saludo";
    }

    @GetMapping("/lombok")
    public String generaLombok(Model model) {

        EjemploLombok ejemploL= EjemploLombok.builder().id(102).nombre("LOMBOK").apellido("TEST").estado(true).build();
        ejemploL.setNombre("CURSO");
        model.addAttribute("name", ejemploL.getNombre());

        return "saludo";
    }

}
