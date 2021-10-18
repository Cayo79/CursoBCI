package com.everis.curso.client;

import com.everis.curso.dto.DolarDTO;

import java.time.LocalDateTime;

public interface DAOIndicadorInterface {

    DolarDTO obtenerDolar(LocalDateTime fecha);
}
