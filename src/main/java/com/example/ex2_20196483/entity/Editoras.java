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
@Table(name = "editoras")
public class Editoras {
    @Id
    @Column(name = "ideditoras")
    private Integer ideditoras;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

}
