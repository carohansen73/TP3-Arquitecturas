package com.example.demo.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Carrera;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.EstudianteCarrera;
import com.example.demo.repositories.EstudianteCarreraRepository;

@Service
public class EstudianteCarreraService {

	@Autowired
	private final EstudianteCarreraRepository estudianteCarreraRepository;
	
	public EstudianteCarreraService(EstudianteCarreraRepository estudianteCarreraRepository) {
		this.estudianteCarreraRepository = estudianteCarreraRepository;
	}
	
	public Iterable<EstudianteCarrera> findAll(){
		return estudianteCarreraRepository.findAll();
	}
	
	public EstudianteCarrera save(Estudiante estudiante, Carrera carrera) {
		//ver q le pasen la fecha! lo ago asi para probar
		EstudianteCarrera nuevo = new EstudianteCarrera(estudiante, carrera, LocalDate.now());
		estudianteCarreraRepository.save(nuevo);
		return nuevo;
	}
	
	
	
	
}
