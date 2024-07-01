package com.example.ex2_20196483.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"idgenero", "idplataforma", "ideditora", "iddistribuidora"})
@Table(name = "juegos")
public class Juegos {
    @Id
    @Column(name = "idjuego")
    private Integer idjuego;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precio")
    private Double precio;

    @Column(name="image")
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "Idenero")
    private Generos idgenero;

    @ManyToOne
    @JoinColumn(name = "Idplataforma")
    private Plataformas idplataforma;

    @ManyToOne
    @JoinColumn(name = "Ideditora")
    private Editoras ideditora;

    @ManyToOne
    @JoinColumn(name = "Iddistribuidora")
    private Distribuidoras iddistribuidora;
}















