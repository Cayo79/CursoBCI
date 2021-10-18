package com.everis.curso.service.impl;

import com.everis.curso.client.DAOAfpResultInterface;
import com.everis.curso.client.DAODataOnemiInterface;
import com.everis.curso.client.DAOIndicadorInterface;
import com.everis.curso.client.DAOUltimoSismoInterface;
import com.everis.curso.dto.AfpDTO;
import com.everis.curso.dto.DataOnemiDTO;
import com.everis.curso.dto.DolarDTO;
import com.everis.curso.dto.UltimoSismosDTO;
import com.everis.curso.service.BSDServiceClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BSDServiceClient implements BSDServiceClientInterface {
    @Autowired
    DAOUltimoSismoInterface daoUltimoSismo;

    @Autowired
    DAODataOnemiInterface daoDataOnemi;

    @Autowired
    DAOAfpResultInterface daoAfpResult;

    @Autowired
    DAOIndicadorInterface daoIndicador;

    @Override
    public UltimoSismosDTO obtenerSismos() {
        return daoUltimoSismo.getUltimoSismo();
    }

    @Override
    public DataOnemiDTO obtenerOnemi() {
        return daoDataOnemi.getDataOnemi();
    }

    @Override
    public List<AfpDTO> obtenerAfp() {
        return daoAfpResult.obtenerAfp();
    }

    @Override
    public DolarDTO obtenerDolar() {
        return daoIndicador.obtenerDolar(LocalDateTime.now());
    }
}
