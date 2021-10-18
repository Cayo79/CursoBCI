package com.everis.curso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SerieDTO {

    private String fecha;// Formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
    private BigDecimal valor;
    private LocalDate segundaFecha;

    private DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
        this.segundaFecha = LocalDate.parse(fecha, inputFormatter);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getSegundaFecha() {
        this.segundaFecha = LocalDate.parse(fecha, inputFormatter);
        return this.segundaFecha;
    }

    public void setSegundaFecha(LocalDate segundaFecha) {
        this.segundaFecha = segundaFecha;
    }
}
