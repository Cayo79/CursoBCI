package com.everis.curso.service.impl;

import com.everis.curso.client.DAODataOnemiInterface;
import com.everis.curso.client.DAOUltimoSismoInterface;
import com.everis.curso.client.impl.DAOUltimoSismo;
import com.everis.curso.dto.DataOnemiDTO;
import com.everis.curso.dto.UltimoSismosDTO;
import com.everis.curso.service.BSDServiceClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BSDServiceClient implements BSDServiceClientInterface {
    @Autowired
    DAOUltimoSismoInterface daoUltimoSismo;

    @Autowired
    DAODataOnemiInterface daoDataOnemi;

    @Override
    public UltimoSismosDTO obtenerSismos() {
        return daoUltimoSismo.getUltimoSismo();
    }

    @Override
    public DataOnemiDTO obtenerOnemi() {
        return daoDataOnemi.getDataOnemi();
    }
}
