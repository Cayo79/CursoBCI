package com.everis.curso.rest;

import com.everis.curso.model.Rol;
import com.everis.curso.model.RolNombre;
import com.everis.curso.model.Usuario;
import com.everis.curso.service.BSDUsuarioInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Test para servicio Usuario")
class RestUsuarioControllerTest {

    /*
    @Autowired
    private BSDUsuarioInterface bsdUsuario;*/

    @InjectMocks
    private RestUsuarioController restUsuario;

    @Mock
    private BSDUsuarioInterface bsdUsuario;
    Usuario usrSal = new Usuario();

    @BeforeEach
    public void setUp() {
        usrSal.setNombre("usuarioTest");
        when(bsdUsuario.crearUsuario(usrSal)).thenReturn(usrSal);
    }

    @Test
    @DisplayName("Test accion crear")
    void crear() {
        Usuario usr = new Usuario();
        usr.setNombre("usuarioTest");
        usr.setClave("12345");

        bsdUsuario.crearUsuario(usr);

        assertTrue(usrSal.getNombre().equals(usr.getNombre()));
    }

    @Test
    @DisplayName("Test accion crear Falla")
    void crearFalla() {
        Usuario usr = new Usuario();
        usr.setNombre("usuarioTest2");
        usr.setClave("12345");

        assertTrue(usr.getNombre().equals(usrSal.getNombre()));
    }
}
