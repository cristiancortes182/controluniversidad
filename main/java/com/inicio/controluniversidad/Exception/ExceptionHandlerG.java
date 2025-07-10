package com.inicio.controluniversidad.Exception;

import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandlerG {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> noEncontrado(NotFoundException ex){
        return new ResponseEntity<>(  Map.of("mensaje", ex.getMessage(), "fecha", LocalDateTime.now().toString()),
                HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> mjErrors(Exception ex){
        return new ResponseEntity<>(
                Map.of("mensaje","Error del servidor", "fecha", LocalDateTime.now()),
                HttpStatus.INTERNAL_SERVER_ERROR
        )
    }

}
