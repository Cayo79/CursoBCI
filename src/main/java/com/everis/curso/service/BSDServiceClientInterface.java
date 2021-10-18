package com.everis.curso.service;

import com.everis.curso.dto.AfpDTO;
import com.everis.curso.dto.DataOnemiDTO;
import com.everis.curso.dto.DolarDTO;
import com.everis.curso.dto.UltimoSismosDTO;

import java.util.List;

public interface BSDServiceClientInterface {
    UltimoSismosDTO obtenerSismos();
    DataOnemiDTO obtenerOnemi();
    List<AfpDTO> obtenerAfp();
    DolarDTO obtenerDolar();
}
