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
@Table(name = "generos")
public class Generos {
    @Id
    @Column(name = "idjuego")
    private Integer idjuego;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;
}
