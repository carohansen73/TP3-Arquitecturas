package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Carrera;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.EstudianteCarrera;
import com.example.demo.services.EstudianteCarreraService;


@RestController
@RequestMapping("estudiante-carrera")
public class EstudianteCarreraController {

	@Autowired
	private final EstudianteCarreraService service;
	
	public EstudianteCarreraController(EstudianteCarreraService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public Iterable<EstudianteCarrera> getAll(){
		return service.findAll();
	}
	
	/*
	@GetMapping("/{id}")
	public Optional<EstudianteCarrera> getById(@PathVariable Integer id){
		return service.findById(id);
	}
	*/
	
	@PostMapping("/")
    public EstudianteCarrera save(@RequestBody Estudiante estudiante, Carrera carrera){
        return service.save(estudiante, carrera);
    }
}
