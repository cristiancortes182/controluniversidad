package com.inicio.controluniversidad.repository;

import com.inicio.controluniversidad.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository  extends JpaRepository<Estudiante,Long> {
}
