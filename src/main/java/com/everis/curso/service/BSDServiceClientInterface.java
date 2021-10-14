package com.everis.curso.service;

import com.everis.curso.dto.DataOnemiDTO;
import com.everis.curso.dto.UltimoSismosDTO;

public interface BSDServiceClientInterface {
    UltimoSismosDTO obtenerSismos();
    DataOnemiDTO obtenerOnemi();
}
