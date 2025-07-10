package com.inicio.controluniversidad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "estudiantes")
public class Estudiante {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private List<NotaAsignatura> notas = new ArrayList<>();




    public Estudiante(List<NotaAsignatura> notas, String correo, String apellido, String nombre, Long id) {
        this.notas = notas;
        this.correo = correo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
    }

    public Estudiante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<NotaAsignatura> getNotas() {
        return notas;
    }

    public void setNotas(List<NotaAsignatura> notas) {
        this.notas = notas;
    }
}
