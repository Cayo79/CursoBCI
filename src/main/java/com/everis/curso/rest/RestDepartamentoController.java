package com.everis.curso.rest;

import com.everis.curso.model.Departamento;
import com.everis.curso.model.Empleado;
import com.everis.curso.service.BSDDepartamentoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class RestDepartamentoController {

    @Autowired
    BSDDepartamentoInterface bsdDepartamento;

    @GetMapping("listar")
    public List<Departamento> listar(){
        return bsdDepartamento.listarDepartamento();
    }

    @GetMapping("listar/emp")
    public List<Empleado> listarEmp(){
        return bsdDepartamento.listarEmpleado(101);
    }

    @PostMapping("crear")
    public Departamento crear (@RequestBody Departamento departamento) {
        return bsdDepartamento.crearDepartamento(departamento);
    }
}
