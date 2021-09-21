package com.everis.curso.service;

import com.everis.curso.model.Empleado;

import java.util.List;

public interface BSDEmpleadoInterface {

    List<Empleado> listarEmpleado();
    Empleado crearEmpleado(Empleado empleado);
    void eliminarEmpleado(Integer id);
}
