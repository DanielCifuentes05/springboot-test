package com.dcifuentes.test.springboot.app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bancos")
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "total_transferencias")
    private int totalTransferencias;

    public Banco(Long id, int totalTransferencias, String nombre) {
        this.id = id;
        this.totalTransferencias = totalTransferencias;
        this.nombre = nombre;
    }

}
