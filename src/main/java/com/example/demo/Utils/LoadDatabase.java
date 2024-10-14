package com.example.demo.Utils;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.modelo.Carrera;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.EstudianteCarrera;
import com.example.demo.repositories.CarreraRepository;
import com.example.demo.repositories.EstudianteRepository;


import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {

	    @Bean
	    CommandLineRunner initDatabase(EstudianteRepository estudianteRepository, CarreraRepository carreraRepo) {
	        return args -> {
	        	
	            var student1 = new Estudiante("Student1", "ApStudent1", LocalDate.now() , 'M' , 123458, "Tres Arroyos", 8);
	            var student2 = new Estudiante("Student2", "ApStudent2", LocalDate.now() , 'M' , 123489, "Tres Arroyos", 9);
	            var student3 = new Estudiante("Student3", "ApStudent3", LocalDate.now() , 'M' , 123481, "Tres Arroyos", 7);
	            
	            var carrera1 = new Carrera("TUDAI");
	            var carrera2 = new Carrera("Filosofia");
	            var carrera3 = new Carrera("Contador publico");
	            
	            var relacion1 = new EstudianteCarrera(student1, carrera1, LocalDate.now());
	            var relacion2 = new EstudianteCarrera(student2, carrera1, LocalDate.now());
	            var relacion3 = new EstudianteCarrera(student3, carrera2, LocalDate.now());
	            var relacion4 = new EstudianteCarrera(student1, carrera3, LocalDate.now());
	            
	          /* Log.info("Preloading " + estudianteRepository.save(student1));
	            log.info("PreloadingcarreraRepository " + estudianteRepository.save(student2));
	            */
	            estudianteRepository.save(student1);
	            estudianteRepository.save(student2);
	            estudianteRepository.save(student3);
	            
	            carreraRepo.save(carrera1);
	            carreraRepo.save(carrera2);
	            carreraRepo.save(carrera3);
	            
	        };
	    }
}
