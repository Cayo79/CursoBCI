package com.everis.curso.rest;

import com.everis.curso.model.Empleado;
import com.everis.curso.service.BSDEmpleadoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class RestEmpleadoController {

    @Autowired
    BSDEmpleadoInterface bsdEmpleado;

    @GetMapping("listar")
    public List<Empleado> listar(){
        return bsdEmpleado.listarEmpleado();
    }

    @PostMapping("crear")
    public Empleado crear (@RequestBody Empleado empleado) {
        return bsdEmpleado.crearEmpleado(empleado);
    }
}
