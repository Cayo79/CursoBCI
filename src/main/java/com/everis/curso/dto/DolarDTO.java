package com.everis.curso.dto;

import java.util.List;

public class DolarDTO {

    private String version;
    private String autor;
    private String codigo;
    private String nombre;
    private String unidadMedida;
    private List<SerieDTO> serie;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<SerieDTO> getSerie() {
        return serie;
    }

    public void setSerie(List<SerieDTO> serie) {
        this.serie = serie;
    }
}
