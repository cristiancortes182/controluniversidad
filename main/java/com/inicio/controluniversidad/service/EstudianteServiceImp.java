package com.inicio.controluniversidad.service;


import com.inicio.controluniversidad.dto.EstudianteDto;
import com.inicio.controluniversidad.dto.EstudianteRequestDto;
import com.inicio.controluniversidad.repository.EstudianteRepository;
import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteServiceImp implements EstudianteService {

    private  final EstudianteRepository estudianteRepository;


    @Override
    public EstudianteDto crear(EstudianteRequestDto dto) {
        return null;
    }

    @Override
    public EstudianteDto obtenerPorId(Long id) {
        return null;
    }

    @Override
    public List<EstudianteDto> obtenerTodos() {
        return List.of();
    }

    @Override
    public EstudianteDto actualizar(Long id, EstudianteRequestDto dto) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }








}
