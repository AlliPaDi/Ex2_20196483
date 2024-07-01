package com.example.ex2_20196483.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "distribuidoras")
public class Distribuidoras {
    @Id
    @Column(name = "iddistribuidora")
    private Integer iddistribuidora;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fundacion")
    @NotNull
    private String fundacion;

    @Column(name="web")
    private String web;

    @ManyToOne
    @JoinColumn(name = "Idsede")
    private Paises idsede;
}
