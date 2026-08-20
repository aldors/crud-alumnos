package com.aldo.crud_alumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.aldo.crud_alumnos.model.Alumno;
import com.aldo.crud_alumnos.service.AlumnoServicio;

@Controller//Esto indica que sera un CONTOLLER, es decir una vista o que se mostrara en una vista
@RequestMapping("/alumnos") //Ruta principal que engloba las demas rutas o vistas HTML

public class AlumnoController {

    @Autowired
    private AlumnoServicio alumnoServicio;

    // 1️ LISTAR alumnos
    @GetMapping
    public String listarAlumnos(Model model) {
        model.addAttribute("listaAlumnos", alumnoServicio.listarTodos());
        return "alumnos";
    }

    // 2️ MOSTRAR formulario nuevo alumno
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "alumno_formulario";
    }

    // 3️ GUARDAR alumno (nuevo o editado)
    @PostMapping("/guardar")
    public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
        alumnoServicio.guardar(alumno);
        return "redirect:/alumnos";
    }

    // 4️ MOSTRAR formulario editar alumno
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Alumno alumno = alumnoServicio.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado: " + id));

        model.addAttribute("alumno", alumno);
        return "alumno_formulario";
    }

    // 5️ ELIMINAR alumno
    @GetMapping("/eliminar/{id}")
    public String eliminarAlumno(@PathVariable Long id) {
        alumnoServicio.eliminar(id);
        return "redirect:/alumnos";
    }
}
