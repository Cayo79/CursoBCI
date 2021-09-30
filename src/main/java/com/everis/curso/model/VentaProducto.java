package com.everis.curso.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Entity
public class VentaProducto implements Serializable {
    private static final long serialVersionUID = 5946891280498293514L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idVentaProducto;

    @ManyToOne
    @JoinColumn(name="idVenta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto producto;

    private Integer precioUnitario;
    private Integer precioTotal;
    private Integer cantidad;

    public int getIdVentaProducto() {
        return idVentaProducto;
    }

    public void setIdVentaProducto(int idVentaProducto) {
        this.idVentaProducto = idVentaProducto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.precioTotal = this.cantidad * precioUnitario;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = cantidad * this.precioUnitario;
    }
}
