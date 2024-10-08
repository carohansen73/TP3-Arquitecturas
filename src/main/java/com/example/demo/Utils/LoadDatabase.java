package com.example.demo.Utils;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repositories.EstudianteRepository;


import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {

	    @Bean
	    CommandLineRunner initDatabase(EstudianteRepository estudianteRepository) {
	        return args -> {
	        	
	            var student1 = new Estudiante("Student1", "ApStudent1", LocalDate.now() , 'M' , 123456, "Tres Arroyos");
	            var student2 = new Estudiante("Student2", "ApStudent2", LocalDate.now() , 'M' , 123487, "Tres Arroyos");
	          /* Log.info("Preloading " + estudianteRepository.save(student1));
	            log.info("PreloadingcarreraRepository " + estudianteRepository.save(student2));
	            */
	            estudianteRepository.save(student1);
	            estudianteRepository.save(student2);
	        };
	    }
}
