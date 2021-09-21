package com.everis.curso.repository;

import lombok.*;

@Builder
@AllArgsConstructor
public class EjemploLombok {

    private long id;
    private @Setter @Getter String nombre;
    private @Getter String apellido;
    private boolean estado;

}
