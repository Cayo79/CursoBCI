package com.everis.curso.service;

import com.everis.curso.model.Promocion;

import java.util.List;

public interface BSDPromocionInterface {

    List<Promocion> listarPromocion();
    Promocion crearPromocion(Promocion promocion);
    void eliminarPromocion(Integer id);
}
