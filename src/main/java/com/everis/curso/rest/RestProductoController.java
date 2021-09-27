package com.everis.curso.rest;

import com.everis.curso.model.Producto;
import com.everis.curso.model.SPConsulta;
import com.everis.curso.service.BSDProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class RestProductoController {

    @Autowired
    BSDProductoInterface bsdProducto;

    @GetMapping
    public List<Producto> listar(){

        //return bsdProducto.listarProducto();
        return bsdProducto.listarEstatusProducto(true);
    }

    @GetMapping("/page/{id}")
    public Page<Producto> listar(@PathVariable Integer id){
        return bsdProducto.listarProductoDesc(id);
    }

    @GetMapping("/nombre")
    public List<Producto> listarNombre(@RequestParam(name="name", required=false, defaultValue ="Mundo") String name){
        return bsdProducto.listarProductoNombre(name);
    }

    @PostMapping
    public Producto crear (@RequestBody Producto producto) {
        return bsdProducto.crearProducto(producto);
    }

    @GetMapping("/consulta/{id}")
    public List<SPConsulta> buscar(@PathVariable Integer id){
        return bsdProducto.buscarConsulta(id);
    }

    @DeleteMapping("borrar/{id}")
    public void eliminar(@PathVariable Integer id) {
        bsdProducto.eliminarProducto(id);
    }
}
