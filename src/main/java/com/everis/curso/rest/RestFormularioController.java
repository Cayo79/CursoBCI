package com.everis.curso.rest;

import com.everis.curso.model.Formulario;
import com.everis.curso.service.BSDFormularioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formulario")
public class RestFormularioController {

    @Autowired
    BSDFormularioInterface bsdFormulario;

    @GetMapping
    public List<Formulario> listar(){
        return bsdFormulario.listarFormulario();
    }

    @PostMapping
    public Formulario crear (@RequestBody Formulario formulario) {
        return bsdFormulario.crearFormulario(formulario);
    }

    @GetMapping("/eliminar/{id}")
    public void eliminarFormulario(@PathVariable Integer id){
        bsdFormulario.eliminarFormulario(id);
    }
}
