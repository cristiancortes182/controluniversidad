package com.inicio.controluniversidad.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudianteDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
}
