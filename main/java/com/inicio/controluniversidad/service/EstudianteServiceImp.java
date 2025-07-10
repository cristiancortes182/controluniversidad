package com.inicio.controluniversidad.service;


import com.inicio.controluniversidad.Exception.NotFoundException;
import com.inicio.controluniversidad.dto.EstudianteDto;
import com.inicio.controluniversidad.dto.EstudianteRequestDto;
import com.inicio.controluniversidad.mapper.EstudianteMapper;
import com.inicio.controluniversidad.model.Estudiante;
import com.inicio.controluniversidad.repository.EstudianteRepository;
import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class EstudianteServiceImp implements EstudianteService {

    private  final EstudianteRepository estudianteRepository;

    public EstudianteServiceImp(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    @Override
    public EstudianteDto crear(EstudianteRequestDto dto) {

        Estudiante estudiante = EstudianteMapper.toEntity(dto);


        return EstudianteMapper.toDto(estudianteRepository.save(estudiante));
    }

    @Override
    public EstudianteDto obtenerPorId(Long id) {

        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow( () -> new NotFoundException("Estudiante no encontrado" + id));
        return EstudianteMapper.toDto(estudiante);
    }

    @Override
    public List<EstudianteDto> obtenerTodos() {

        return estudianteRepository.findAll().stream()
                .map(EstudianteMapper::toDto)
                .collect(Collectors.toList());


    }

    @Override
    public EstudianteDto actualizar(Long id, EstudianteRequestDto dto) {

        Estudiante estudiante = estudianteRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Estudiante no encontrado" + id));

        return EstudianteMapper.toDto(estudianteRepository.save(estudiante));
    }

    @Override
    public void eliminar(Long id) {
        if(!estudianteRepository.existsById(id)){
            throw new NotFoundException("Estudiante no encontrado" + id);
        }
        estudianteRepository.deleteById(id);

    }








}
