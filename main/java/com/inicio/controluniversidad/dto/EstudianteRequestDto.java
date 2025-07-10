package com.inicio.controluniversidad.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudianteRequestDto {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;

    @NotBlank
    @Email
    private String correo;
}
