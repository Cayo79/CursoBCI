package com.everis.curso.service.impl;

import com.everis.curso.dao.DAODepartamentoInterface;
import com.everis.curso.model.Departamento;
import com.everis.curso.model.Empleado;
import com.everis.curso.service.BSDDepartamentoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDDepartamento implements BSDDepartamentoInterface {

    @Autowired
    DAODepartamentoInterface daoDepartamento;

    @Override
    public List<Departamento> listarDepartamento() {
        return daoDepartamento.findAll();
    }

    @Override
    public List<Empleado> listarEmpleado(Integer id) {
        return daoDepartamento.findById(id).orElse(null).getEmpleados();
    }

    @Override
    public Departamento crearDepartamento(Departamento departamento) {
        return daoDepartamento.save(departamento);
    }

    @Override
    public void eliminarDepartamento(Integer id) {
        if(!id.equals(0)) {
            daoDepartamento.deleteById(id);
        }
    }
}
