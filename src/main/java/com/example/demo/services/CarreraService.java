package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Carrera;
import com.example.demo.repositories.CarreraRepository;



@Service
public class CarreraService {
	
	@Autowired
	private final CarreraRepository carreraRepository;
	
	public CarreraService(CarreraRepository carreraRepository) {
		 this.carreraRepository = carreraRepository;
	}
	
	public Iterable<Carrera> findAll(){
		return carreraRepository.findAll();
	}

	public Optional<Carrera> findById(Integer id){
		return carreraRepository.findById(id);
	}
	
	public Carrera save(Carrera carrera) {
		carreraRepository.save(carrera);
		return carrera;
	}
	
	/*public Carrera update(Carrera carrera) {	
	}
	*/

	public void delete(Integer id) {
		carreraRepository.deleteById(id);
	}
	
}













