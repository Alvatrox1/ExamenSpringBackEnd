package com.examen.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.examen.model.Persona;

import java.util.List;


public interface PersonaRepository extends JpaRepository<Persona, Long>{

	List<Persona> findByNombre( @Param("nombre") String nombre);
	List<Persona> findByApellidoPaterno( @Param("apellidoPaterno") String apPaterno);
	Persona findByIdPersona( @Param("idPersona") Long idPersona);
}
