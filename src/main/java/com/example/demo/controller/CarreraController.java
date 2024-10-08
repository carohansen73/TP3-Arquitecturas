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
import com.example.demo.services.CarreraService;

@RestController
@RequestMapping("carreras")
public class CarreraController {

	@Autowired
	private final CarreraService service;
	
	public CarreraController(CarreraService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public Iterable<Carrera> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Carrera> getById(@PathVariable Integer id){
		return service.findById(id);
	}
	
	@PostMapping("/")
    public Carrera save(@RequestBody Carrera carrera){
        return service.save(carrera);
    }
	
}








