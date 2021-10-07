package com.everis.curso.security.jwt;

import com.everis.curso.model.Rol;
import com.everis.curso.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuario user) {
        return new JwtUser(
                user.getIdUsuario(),
                user.getNombre(),
                user.getClave(),
                user.getCorreo(),
                mapToGrantedAuthorities(user.getRoles()),
                user.getEnabled(),
                user.getLastPasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Rol> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getNombre().name()))
                .collect(Collectors.toList());
    }
}

