package com.sidd.app.serviciosidd.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sidd.app.serviciosidd.models.entity.Persona;
import com.sidd.app.serviciosidd.models.service.IPersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
		
	
	public PersonaController() {

	}

	@GetMapping("/listar")
	public List<Persona> listar(){
		return personaService.findAll().stream().map(persona -> {
						return persona;
					}).collect(Collectors.toList());
	}
	
	@GetMapping("/ver/{id}")
	public Persona detalle(@PathVariable Long id) {
		Persona persona = personaService.findById(id);
		return persona;
	}
}
