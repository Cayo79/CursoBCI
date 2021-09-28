package com.everis.curso.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Formulario implements Serializable {

    private static final long serialVersionUID = -3710970634703052976L;

    public enum Tipo {
        Particular,
        Casa,
        Oficina,
        Celular,
        Otro
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idFormulario;
    private String nombreCompleto;
    private String correo;

    @Enumerated(EnumType.ORDINAL)
    private Tipo tipoContacto;
    private String telefono;
    private String comentario;

    @Enumerated(EnumType.STRING)
    private Tipo tipoTelefono;

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Tipo getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(Tipo tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Tipo getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(Tipo tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
}
