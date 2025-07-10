package com.inicio.controluniversidad.controller;


import com.inicio.controluniversidad.dto.EstudianteDto;
import com.inicio.controluniversidad.dto.EstudianteRequestDto;
import com.inicio.controluniversidad.repository.EstudianteRepository;
import com.inicio.controluniversidad.service.EstudianteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteControlador {



    private final EstudianteService estudianteService;

    public EstudianteControlador(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }


    @PostMapping
    public ResponseEntity<EstudianteDto> crear (@RequestBody @Valid EstudianteRequestDto estudianteDto){

        return ResponseEntity.ok(estudianteService.crear(estudianteDto));

    }



}
