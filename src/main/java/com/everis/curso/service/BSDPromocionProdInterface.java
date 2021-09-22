package com.everis.curso.service;

import com.everis.curso.model.PromocionProducto;

import java.util.List;

public interface BSDPromocionProdInterface {

    List<PromocionProducto> listarPromocionProd();
    PromocionProducto crearPromocionProd(PromocionProducto promocionProducto);
    void eliminarPromocionProd(Integer id);
}
