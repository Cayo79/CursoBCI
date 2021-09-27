package com.everis.curso.model;

import javax.persistence.*;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "SP_Producto",
                procedureName = "obtenerProductosPorId",
                resultClasses = { SPConsulta.class },
                parameters = {
                        @StoredProcedureParameter(
                                mode = ParameterMode.IN,
                                name = "vId",
                                type = Integer.class )
                }
        )
})
public class SPConsulta {
    @Id
    private int idProducto;
    private String descripcion;
    private String nombre;
    private String consulta;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
}
