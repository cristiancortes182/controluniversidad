package com.inicio.controluniversidad.model;

import jakarta.persistence.*;

@Entity
@Table(name = "notas_asignaturas")
public class NotaAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double nota;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;
}
