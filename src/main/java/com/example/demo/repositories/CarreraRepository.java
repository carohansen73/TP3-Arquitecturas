package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Carrera;


@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {

}
