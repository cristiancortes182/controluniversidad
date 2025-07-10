package com.inicio.controluniversidad.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String especialidad;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Asignatura> asignaturas = new ArrayList<>();
}
