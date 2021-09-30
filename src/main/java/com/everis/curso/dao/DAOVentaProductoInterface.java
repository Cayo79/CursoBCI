package com.everis.curso.dao;

import com.everis.curso.model.Venta;
import com.everis.curso.model.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAOVentaProductoInterface extends JpaRepository<VentaProducto, Integer> {

    List<VentaProducto> findByVentaEquals(Venta venta);
}
