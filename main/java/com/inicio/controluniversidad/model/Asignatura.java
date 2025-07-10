package com.inicio.controluniversidad.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

     @ManyToOne
     @JoinColumn(name = "materia_id")
     private Materia materia;


     @ManyToOne
     @JoinColumn(name = "profesor_id")
     private Profesor profesor;

     @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL)
    private List<HorarioAsignatura> horarios = new ArrayList<>();

     @OneToMany(mappedBy = "asignatura" , cascade = CascadeType.ALL)
    private List<NotaAsignatura> notas = new ArrayList<>();
}
