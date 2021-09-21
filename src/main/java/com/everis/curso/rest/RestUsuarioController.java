package com.everis.curso.rest;

import com.everis.curso.dao.DAOUsuarioInterface;
import com.everis.curso.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class RestUsuarioController {

    @Autowired
    private DAOUsuarioInterface daoUsuario;

    @GetMapping("listar")
    public List<Usuario> listar(){
        return daoUsuario.findAll();
    }

    @PostMapping("crear")
    public Usuario crear (@RequestBody Usuario usuario) {
        return daoUsuario.save(usuario);
    }
}
