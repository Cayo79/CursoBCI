package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOEmpleadoInterface;
import com.everis.curso.model.Empleado;
import com.everis.curso.service.BSDEmpleadoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSDEmpleado implements BSDEmpleadoInterface {
    @Autowired
    DAOEmpleadoInterface daoEmpleado;

    @Override
    public List<Empleado> listarEmpleado() {
        return daoEmpleado.findAll();
    }

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return daoEmpleado.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Integer id) {
        daoEmpleado.deleteById(id);
    }
}
