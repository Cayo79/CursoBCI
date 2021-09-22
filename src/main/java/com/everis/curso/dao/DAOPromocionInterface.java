package com.everis.curso.dao;

import com.everis.curso.model.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOPromocionInterface extends JpaRepository<Promocion, Integer> {
}
