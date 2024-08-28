package com.dcifuentes.test.springboot.app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Banco {

    private Long id;
    private String nombre;
    private int totalTransferencias;

    public Banco(Long id, int totalTransferencias, String nombre) {
        this.id = id;
        this.totalTransferencias = totalTransferencias;
        this.nombre = nombre;
    }

}
