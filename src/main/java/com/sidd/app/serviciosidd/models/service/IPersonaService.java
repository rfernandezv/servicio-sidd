package com.sidd.app.serviciosidd.models.service;

import java.util.List;

import com.sidd.app.serviciosidd.models.entity.Persona;


public interface IPersonaService {
	public List<Persona> findAll();
	public Persona findById(Long Id);
        public Persona findByNroDocumento(String nroDocumento);
}
