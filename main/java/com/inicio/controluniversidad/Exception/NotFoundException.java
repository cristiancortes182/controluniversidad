package com.inicio.controluniversidad.Exception;

import com.inicio.controluniversidad.dto.EstudianteRequestDto;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String mesaje) {
        super(mesaje);
    }
}
