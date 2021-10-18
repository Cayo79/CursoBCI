package com.everis.curso.rest;

import com.everis.curso.dto.AfpDTO;
import com.everis.curso.dto.DataOnemiDTO;
import com.everis.curso.dto.DolarDTO;
import com.everis.curso.dto.UltimoSismosDTO;
import com.everis.curso.service.BSDServiceClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class RestServiceClientController {

    @Autowired
    BSDServiceClientInterface bsdServiceClient;

    @GetMapping("/onemi")
    public DataOnemiDTO obtenerOnemi(){
        return bsdServiceClient.obtenerOnemi();
    }

    @GetMapping("/sismo")
    public UltimoSismosDTO obtenerSismos() {
        return bsdServiceClient.obtenerSismos();
    }

    @GetMapping("/afp")
    public List<AfpDTO> obtenerResultadosAfp() {
        return bsdServiceClient.obtenerAfp();
    }

    @GetMapping("/dolar/Hoy")
    public DolarDTO obtenerDolarActual() {
        return bsdServiceClient.obtenerDolar();
    }

}
