package com.everis.curso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AfpDTO {

    private String afp;
    private String fecha;// Formato YYYY-MM-DD
    private String fondo;
    private Double valor;
    private Double valorUf;

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorUf() {
        return valorUf;
    }

    public void setValorUf(Double valorUf) {
        this.valorUf = valorUf;
    }
}
