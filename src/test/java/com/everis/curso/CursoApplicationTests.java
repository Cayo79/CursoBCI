package com.everis.curso;

import com.everis.curso.model.Departamento;
import com.everis.curso.model.Empleado;
import com.everis.curso.service.BSDDepartamentoInterface;
import com.everis.curso.service.BSDEmpleadoInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CursoApplicationTests {

    @Autowired
    BSDDepartamentoInterface bsdDepartamento;

    @Autowired
    BSDEmpleadoInterface bsdEmpleado;

    @Test
    void contextLoads() {
    }

    @Test
    void crearDepartamento(){
        Departamento dep = new Departamento();
        dep.setIdDepartamento(101);
        dep.setNombre("Tecnologia");
        dep.setUbicacion("Santiago");

        Departamento newDep = bsdDepartamento.crearDepartamento(dep);
        assertTrue(dep.getNombre().equals(newDep.getNombre()));
    }

    @Test
    void crearEmpleado() {
        Empleado emp = new Empleado();
        emp.setNombre("Tatiana");
        emp.setApellido("Pozo");
        emp.setRut("27-9");
        Departamento dep = new Departamento();
        dep.setIdDepartamento(101);
        emp.setDepartamento(dep);

        Empleado newEmp = bsdEmpleado.crearEmpleado(emp);
        assertTrue(emp.getRut().equals(newEmp.getRut()));
    }
}
