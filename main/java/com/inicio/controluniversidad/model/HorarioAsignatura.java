package com.inicio.controluniversidad.model;

import jakarta.persistence.*;

@Entity
@Table(name = "horarios_asignaturas")
public class HorarioAsignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dia;
    private String horaInicio;
    private String horaFin;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;
}
