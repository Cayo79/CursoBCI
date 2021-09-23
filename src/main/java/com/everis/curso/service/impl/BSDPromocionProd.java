package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOPromocionProductoInterface;
import com.everis.curso.model.Promocion;
import com.everis.curso.model.PromocionProducto;
import com.everis.curso.service.BSDPromocionProdInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDPromocionProd implements BSDPromocionProdInterface {

    @Autowired
    DAOPromocionProductoInterface daoPromocionProd;

    @Override
    public List<PromocionProducto> listarPromocionProd() {
        return daoPromocionProd.findAll();
    }

    @Override
    public PromocionProducto crearPromocionProd(PromocionProducto promocionProducto) {
        return daoPromocionProd.save(promocionProducto);
    }

    @Override
    public void eliminarPromocionProd(Integer id) {
        daoPromocionProd.deleteById(id);
    }

    @Override
    public void eliminarPromocion(Integer id) {
        Promocion prom = new Promocion();
        prom.setIdPromocion(id);

        List <PromocionProducto> lista = daoPromocionProd.findByPromocionEquals(prom);
        lista.forEach(promoc -> {
            daoPromocionProd.deleteById(promoc.getIdPP());
        });
    }
}
