package com.aldo.crud_alumnos.service;

import java.util.List;
import java.util.Optional;

import com.aldo.crud_alumnos.model.Alumno;

public interface AlumnoServicio {

    List<Alumno> listarTodos();
    Optional<Alumno> buscarPorId(Long id);
    Alumno guardar(Alumno alumno);
    void eliminar(Long id);
}
