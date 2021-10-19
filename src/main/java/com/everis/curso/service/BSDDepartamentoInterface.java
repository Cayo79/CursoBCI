package com.everis.curso.service;

import com.everis.curso.model.Departamento;
import com.everis.curso.model.Empleado;

import java.util.List;

public interface BSDDepartamentoInterface {

    List<Departamento> listarDepartamento();
    List<Empleado> listarEmpleado(Integer id);
    Departamento crearDepartamento(Departamento departamento);
    void eliminarDepartamento(Integer id);
}
