package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repositories.EstudianteRepository;

@Service
public class EstudianteService {
	
	@Autowired
	private final EstudianteRepository repository;
	
	public EstudianteService(EstudianteRepository repository) {
		 this.repository = repository;
	}
	
	public Iterable<Estudiante> findAll(){
		return repository.findAll();
	}
	
	public Optional<Estudiante> findById(Integer id){
		return repository.findById(id);
	}
	
	public Estudiante save(Estudiante estudiante) {
		repository.save(estudiante);
		return estudiante;
	}
	
	/*public Estudiante update(Estudiante estudiante) {	
	}
	*/
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public Optional<Estudiante> findByLibreta(int nro){
		return repository.findByLibreta(nro);
	}

	public Iterable<Estudiante> findByGenero(Character genero){
		return repository.findByGenero(genero);
	}

}
