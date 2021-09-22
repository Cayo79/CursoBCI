package com.everis.curso.dao;

import com.everis.curso.model.PromocionProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOPromocionProductoInterface extends JpaRepository<PromocionProducto, Integer> {
}
