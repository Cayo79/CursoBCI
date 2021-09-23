package com.everis.curso.dao;

import com.everis.curso.model.Promocion;
import com.everis.curso.model.PromocionProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAOPromocionProductoInterface extends JpaRepository<PromocionProducto, Integer> {

    List<PromocionProducto> findByPromocionEquals(Promocion promocion);
}
