package com.example.ex2_20196483.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "paises")
public class Paises {
    @Id
    @Column(name = "idpais")
    private Integer idpais;

    @Column(name = "iso")
    private char iso;

    @Column(name="nombre")
    private String nombre;
}
