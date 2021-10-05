package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOUsuarioInterface;
import com.everis.curso.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    DAOUsuarioInterface daoUsuario;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Usuario usr = daoUsuario.findByNombreEquals(s);

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("USER"));
        roles.add(new SimpleGrantedAuthority("ADMIN"));

        UserDetails userDet = new User(usr.getNombre(),usr.getClave(), roles);
        return userDet;
    }
}
