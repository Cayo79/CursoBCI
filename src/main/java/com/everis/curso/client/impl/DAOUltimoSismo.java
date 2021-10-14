package com.everis.curso.client.impl;

import com.everis.curso.client.DAOUltimoSismoInterface;
import com.everis.curso.dto.UltimoSismosDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class DAOUltimoSismo implements DAOUltimoSismoInterface {

    @Autowired
    Environment env;

    @Override
    public UltimoSismosDTO getUltimoSismo() {
        RestTemplate restTemplate = new RestTemplate();

        String urlString = env.getProperty("api-server-ultimo");
        String salida;
        UltimoSismosDTO respuesta = new UltimoSismosDTO();
        try {
            salida = restTemplate.getForObject(urlString, String.class);
            Gson gson = new Gson();
            respuesta = gson.fromJson(salida, UltimoSismosDTO.class);
        } catch (HttpClientErrorException e) {
            // LOG.error("ERROR al realizar consulta: " + e.getMessage());
        }

        return respuesta;
    }
}
