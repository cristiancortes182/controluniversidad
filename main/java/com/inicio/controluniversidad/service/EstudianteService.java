package com.inicio.controluniversidad.service;

import com.inicio.controluniversidad.dto.EstudianteDto;
import com.inicio.controluniversidad.dto.EstudianteRequestDto;
import com.inicio.controluniversidad.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstudianteService {

    EstudianteDto crear(EstudianteRequestDto dto);
    EstudianteDto obtenerPorId(Long id);
    List<EstudianteDto> obtenerTodos();
    EstudianteDto actualizar(Long id, EstudianteRequestDto dto);
    void eliminar(Long id);

}
