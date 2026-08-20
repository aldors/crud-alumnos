package com.aldo.crud_alumnos.repository;

import org.springframework.stereotype.Repository;
import com.aldo.crud_alumnos.model.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository//Esto indica que esta clase sera un repositorio (Donde llegan o se manejan los datos de la db)

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{ //Aqui se extiende de una clase JpaRepository y se le pasa el nombre de la db <Alumno, y el tipo de dato del id Long>

}
