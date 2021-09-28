package com.everis.curso.dao;

import com.everis.curso.model.SPConsultaNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DAOSPConsultaNombreInterface extends JpaRepository<SPConsultaNombre, Integer> {

    @Query(value = "{call obtenerProductosPorNombre(:vNombre)}", nativeQuery = true)
    List<SPConsultaNombre> procedureName(@Param("vNombre") String vNombre);
}
