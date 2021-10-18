package com.everis.curso.client.impl;

import com.everis.curso.client.DAOAfpResultInterface;
import com.everis.curso.dto.AfpDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
public class DAOAfpResult implements DAOAfpResultInterface {

    @Value("${api-server-afp}")
    private String urlAfp;

    @Override
    public List<AfpDTO> obtenerAfp() {
        RestTemplate restTemplate = new RestTemplate();

        String salida;
        List<AfpDTO> respuesta = new ArrayList<>();
        try {
            salida = restTemplate.getForObject(urlAfp, String.class);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<AfpDTO>>(){}.getType();
            respuesta = gson.fromJson(String.valueOf(salida), listType);
        } catch (HttpClientErrorException e) {
            // LOG.error("ERROR al realizar consulta: " + e.getMessage());
            salida = "salida";
        }

        return respuesta;
    }
}
