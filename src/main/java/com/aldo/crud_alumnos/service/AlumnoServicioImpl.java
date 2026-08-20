package com.aldo.crud_alumnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldo.crud_alumnos.model.Alumno;
import com.aldo.crud_alumnos.repository.AlumnoRepository;

@Service//Esto indica que esta clase sera un servicio(O la Logica de negocio)

public class AlumnoServicioImpl implements AlumnoServicio{
    
    @Autowired
    private AlumnoRepository alumnoRepository; //Inyeccion de deoendencias

    
    @Override
    public List<Alumno> listarTodos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Optional<Alumno> buscarPorId(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);
    }
}
