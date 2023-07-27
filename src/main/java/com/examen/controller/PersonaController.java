package com.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.model.Persona;
import com.examen.service.PersonaRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonaController {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@GetMapping("/listarPersonas")
	public List<Persona> getPersonas() {
		return personaRepository.findAll();
	}
	
	@GetMapping("/persona/{idPersona}")
	public Persona findByIdPersona(@PathVariable("idPersona") Long idPersona ) {
		return personaRepository.findByIdPersona(idPersona);
	}
	
	@PostMapping("/guardarPersona")
	public Persona savePersona( @RequestBody Persona persona ) {
		return personaRepository.save(persona);
	}
	
	@PutMapping("/persona/{idPersona}")
	public Persona updatePersona( @PathVariable Long idPersona, @RequestBody Persona persona ) {
		return personaRepository.save(persona);
	}
	
	@DeleteMapping("/persona/{idPersona}")
	public void deletePersona( @PathVariable("idPersona") Long id) {
		personaRepository.deleteById(id);
	}

	@GetMapping("/saludo")
	public String camino() {
		return "Saludos Joven Internauta";
	}
	
}
