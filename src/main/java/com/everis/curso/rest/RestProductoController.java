package com.everis.curso.rest;

import com.everis.curso.model.Producto;
import com.everis.curso.service.BSDProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class RestProductoController {

    @Autowired
    BSDProductoInterface bsdProducto;

    @GetMapping
    public List<Producto> listar(){
        return bsdProducto.listarProducto();
    }

    @PostMapping
    public Producto crear (@RequestBody Producto producto) {
        return bsdProducto.crearProducto(producto);
    }
}
