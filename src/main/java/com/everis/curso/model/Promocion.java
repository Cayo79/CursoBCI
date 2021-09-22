package com.everis.curso.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.everis.curso.util.Util.convertStringToDate_YYYYMMDD;

@Entity
public class Promocion implements Serializable {
    private static final long serialVersionUID = -8516872258116397892L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idPromocion;

    private String descripcion;
    private Date fechaDesde;
    private Date fechaHasta;

    @Transient
    private String fdesde; // 'yyyy-mm-dd'
    @Transient
    private String fhasta;

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getFdesde() {
        return fdesde;
    }

    public void setFdesde(String fdesde) {
        this.fdesde = fdesde;
        this.fechaDesde = convertStringToDate_YYYYMMDD(fdesde);
    }

    public String getFhasta() {
        return fhasta;
    }

    public void setFhasta(String fhasta) {
        this.fhasta = fhasta;
        this.fechaHasta = convertStringToDate_YYYYMMDD(fhasta);
    }
}
