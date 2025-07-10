package com.inicio.controluniversidad.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL)
    private List<Asignatura> asignaturas = new ArrayList<>();
}
