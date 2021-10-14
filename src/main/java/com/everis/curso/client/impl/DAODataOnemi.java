package com.everis.curso.client.impl;

import com.everis.curso.client.DAODataOnemiInterface;
import com.everis.curso.dto.DataOnemiDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class DAODataOnemi implements DAODataOnemiInterface {

    @Value("${api-server-onemi}")
    private String urlOnemi;

    @Override
    public DataOnemiDTO getDataOnemi() {
        RestTemplate restTemplate = new RestTemplate();

        String salida;
        DataOnemiDTO respuesta = new DataOnemiDTO();
        try {
            salida = restTemplate.getForObject(urlOnemi, String.class);
            Gson gson = new Gson();
            respuesta = gson.fromJson(salida, DataOnemiDTO.class);
        } catch (HttpClientErrorException e) {
            // LOG.error("ERROR al realizar consulta: " + e.getMessage());
        }

        return respuesta;
    }
}
