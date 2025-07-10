package com.inicio.controluniversidad.mapper;

import com.inicio.controluniversidad.dto.EstudianteDto;
import com.inicio.controluniversidad.dto.EstudianteRequestDto;
import com.inicio.controluniversidad.model.Estudiante;

public class EstudianteMapper {

    public static EstudianteDto toDto(Estudiante estudiante){

        EstudianteDto dto = new EstudianteDto();

        dto.setId(estudiante.getId());
        dto.setNombre(estudiante.getNombre());
        dto.setApellido(estudiante.getApellido());
        dto.setCorreo(estudiante.getCorreo());
        return dto;

    }

    public static Estudiante toEntity(EstudianteRequestDto dto){

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(dto.getNombre());
        estudiante.setApellido(dto.getApellido());
        return estudiante;


    }
}
