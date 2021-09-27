package com.everis.curso.rest;

import com.everis.curso.dao.DAOUsuarioInterface;
import com.everis.curso.model.Usuario;
import com.everis.curso.service.BSDUsuarioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class RestUsuarioController {

    @Autowired
    private BSDUsuarioInterface bsdUsuario;

    @GetMapping("listar")
    public List<Usuario> listar(){
        return bsdUsuario.listar();
    }

    @PostMapping("crear")
    public Usuario crear (@RequestBody Usuario usuario) {
        return bsdUsuario.crearUsuario(usuario);
    }

    @DeleteMapping("borrar/{id}")
    public void eliminar(@PathVariable Integer id) {
        bsdUsuario.borrarUsuario(id);
    }
}
