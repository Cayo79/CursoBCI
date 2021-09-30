package com.everis.curso.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.everis.curso.util.Util.convertStringToDate_YYYYMMDD;

@Entity
public class Venta implements Serializable {

    private static final long serialVersionUID = 8228447390303701244L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idVenta;

    private Date fechaVenta;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @Transient
    private String fventa; // 'yyyy-mm-dd'

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFventa() {
        return fventa;
    }

    public void setFventa(String fventa) {
        this.fventa = fventa;
        this.fechaVenta = convertStringToDate_YYYYMMDD(fventa);
    }
}
