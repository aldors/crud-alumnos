package com.aldo.crud_alumnos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Esto indica que será una entidad(TABLA) en la base de datos.
@Table(name = "alumnos") //Esto indice que ese sera el nombre REAL dentro de la base de datos

public class Alumno {

    @Id //Esto indica que es el Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto indica que el id se autoincrementara en la db
    private Long id;

    /*Los @Columns son para crear la tabla(ENTIDAD/ENTITY) automaticamente sin crearla nosotros en workbench(mysql)*/

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, unique = true, length = 20)
    private String matricula;

    @Column(nullable = false, unique = true, length = 100)
    private String correo;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false, length = 10)
    private String grado;

    @Column(nullable = false, length = 5)
    private String grupo;

    @Column(nullable = false)
    private boolean activo = true;

    //CONSTRUCTOR
    public Alumno(){}
    
    // Constructor con campos (opcional, pero útil)
    public Alumno(String nombre, String apellido, String matricula, String correo,int edad, String grado, String grupo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
        this.edad = edad;
        this.grado = grado;
        this.grupo = grupo;
        this.activo = true;
    }



    //GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
