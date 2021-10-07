package com.everis.curso;

import com.everis.curso.model.Rol;
import com.everis.curso.model.RolNombre;
import com.everis.curso.service.BSDDepartamentoInterface;
import com.everis.curso.service.BSDEmpleadoInterface;
import com.everis.curso.service.BSDRolInterface;
import com.everis.curso.service.BSDUsuarioInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CursoApplicationTests {

    @Autowired
    BSDDepartamentoInterface bsdDepartamento;

    @Autowired
    BSDEmpleadoInterface bsdEmpleado;

    @Autowired
    BSDUsuarioInterface bsdUsuario;

    @Autowired
    BSDRolInterface bsdRol;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
    }
/*
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

    @Test
    void crearUsuarioCodificado(){
        Usuario usr = new Usuario();
        usr.setNombre("codificado");
        usr.setClave(passwordEncoder.encode("123"));

        Usuario newUsr = bsdUsuario.crearUsuario(usr);
        assertTrue((usr.getNombre().equals(newUsr.getNombre())));
    }

    @Test
    void crearUsuarioCodificado2(){
        Usuario usr = new Usuario();
        usr.setNombre("codex");
        usr.setClave(passwordEncoder.encode("123"));

        Usuario newUsr = bsdUsuario.crearUsuario(usr);
        assertTrue((usr.getNombre().equals(newUsr.getNombre())));
    }
*/
    @Test
    void crearRolesUser(){
        Rol rol = new Rol();
        rol.setNombre(RolNombre.ROLE_USER);

        Rol newRol = bsdRol.crearRol(rol);
        assertTrue((rol.getNombre().equals(newRol.getNombre())));
    }

    @Test
    void crearRolesAdmin(){
        Rol rol = new Rol();
        rol.setNombre(RolNombre.ROLE_ADMIN);

        Rol newRol = bsdRol.crearRol(rol);
        assertTrue((rol.getNombre().equals(newRol.getNombre())));
    }
}
