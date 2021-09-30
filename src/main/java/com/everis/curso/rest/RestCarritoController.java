package com.everis.curso.rest;

import com.everis.curso.model.Carrito;
import com.everis.curso.model.Venta;
import com.everis.curso.service.BSDCarritoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class RestCarritoController {

    @Autowired
    BSDCarritoInterface bsdCarrito;

    @GetMapping("usuario/{id}")
    public List<Carrito> listarUsuario(@PathVariable (value = "id") Integer id) {
        return bsdCarrito.buscarCarritoUsuario(id);
    }

    @GetMapping
    public List<Carrito> listar() {
        return bsdCarrito.listarCarrito();
    }

    @PostMapping
    public Carrito insertar(@RequestBody Carrito carrito) {
        return bsdCarrito.crearCarrito(carrito);
    }

    @PostMapping("/comprar")
    public Venta comprar(@RequestBody List<Carrito> listaCarrito) {
        return bsdCarrito.comprar(listaCarrito);
    }
}
