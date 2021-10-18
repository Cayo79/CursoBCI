package com.everis.curso.client.impl;

import com.everis.curso.client.DAOIndicadorInterface;
import com.everis.curso.dto.DolarDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Component
public class DAOIndicador implements DAOIndicadorInterface {

    @Value("${api-server-ind}")
    private String urlIndicador;

    @Override
    public DolarDTO obtenerDolar(LocalDateTime fecha) {
        RestTemplate restTemplate = new RestTemplate();

        String salida;
        String formatoFecha = String.format("%1$02d",fecha.getDayOfMonth()) + "-" +
                String.format("%1$02d",fecha.getMonthValue()) + "-" + fecha.getYear();
        DolarDTO respuesta = new DolarDTO();
        try {
            salida = restTemplate.getForObject(urlIndicador + "/" + formatoFecha, String.class);
            Gson gson = new Gson();
            respuesta = gson.fromJson(salida, DolarDTO.class);
        } catch (HttpClientErrorException e) {
            // LOG.error("ERROR al realizar consulta: " + e.getMessage());
        }

        return respuesta;
    }
}
