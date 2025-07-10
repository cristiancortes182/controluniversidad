package com.inicio.controluniversidad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String apellido;
    private String correo;

    @OneToMany(mappedBy = "estudiantes", cascade = CascadeType.ALL)
    private List<NotaAsignatura> notas = new ArrayList<>();
}
