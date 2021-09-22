package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOPromocionInterface;
import com.everis.curso.model.Promocion;
import com.everis.curso.service.BSDPromocionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDPromocion implements BSDPromocionInterface {

    @Autowired
    private DAOPromocionInterface daoPromocion;

    @Override
    public List<Promocion> listarPromocion() {
        return daoPromocion.findAll();
    }

    @Override
    public Promocion crearPromocion(Promocion promocion) {
        return daoPromocion.save(promocion);
    }

    @Override
    public void eliminarPromocion(Integer id) {
        daoPromocion.deleteById(id);
    }
}
