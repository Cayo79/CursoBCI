package com.everis.curso.rest;

import com.everis.curso.model.Promocion;
import com.everis.curso.model.PromocionProducto;
import com.everis.curso.service.BSDPromocionInterface;
import com.everis.curso.service.BSDPromocionProdInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promocion")
public class RestPromocionController {

    @Autowired
    BSDPromocionInterface bsdPromocion;

    @Autowired
    BSDPromocionProdInterface bsdPromocionProd;

    @GetMapping
    public List<Promocion> listar(){
        return bsdPromocion.listarPromocion();
    }

    @PostMapping
    public Promocion crear (@RequestBody Promocion promocion) {
        return bsdPromocion.crearPromocion(promocion);
    }

    @GetMapping("/promocionP")
    public List<PromocionProducto> listarPP(){
        return bsdPromocionProd.listarPromocionProd();
    }

    @PostMapping("/promocionP")
    public PromocionProducto crearPP (@RequestBody PromocionProducto promocionProd) {
        return bsdPromocionProd.crearPromocionProd(promocionProd);
    }

    @GetMapping("/eliminar/{id}")
    public void eliminarPromocion(@PathVariable Integer id){
        bsdPromocionProd.eliminarPromocion(id);
    }
}
