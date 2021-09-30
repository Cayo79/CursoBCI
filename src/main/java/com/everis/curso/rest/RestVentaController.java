package com.everis.curso.rest;

import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;
import com.everis.curso.service.BSDVentaInterface;
import com.everis.curso.service.BSDVentaProductoInterface;
import com.everis.curso.service.impl.BSDVentaProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class RestVentaController {

    @Autowired
    private BSDVentaInterface bsdVenta;

    @Autowired
    private BSDVentaProductoInterface bsdVentaProducto;

    @GetMapping
    public List<Venta> listar(){
        return bsdVenta.listarVenta();
    }

    @PostMapping
    public Venta crear (@RequestBody Venta venta) {
        return bsdVenta.crearVenta(venta);
    }

    @DeleteMapping("borrar/{id}")
    public void eliminar(@PathVariable Integer id) {
        bsdVenta.eliminarVenta(id);
    }

    @GetMapping("/usuarios/{id}")
    public List<Venta> listarVentas(@PathVariable Integer id) {
        return bsdVenta.listarUsuario(id);
    }

    @GetMapping("/productos/{id}")
    public List<VentaProducto> listarProductos(@PathVariable Integer id){
        return bsdVentaProducto.listarProductosVenta(id);
    }

    @GetMapping("/productos/usuario/{id}")
    public List<VentaProducto> listarProductosUsuario(@PathVariable Integer id){
        return bsdVenta.listaProductos(id);
    }
}
