package com.sidd.app.serviciosidd.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sidd.app.serviciosidd.models.dao.PersonaDao;
import com.sidd.app.serviciosidd.models.entity.Persona;


@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private PersonaDao personaDao;
	
	@Override
	//@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	//@Transactional(readOnly = true)
	public Persona findById(Long id) {
		return personaDao.getOne(id);
	}
        
        @Override
	//@Transactional(readOnly = true)
	public Persona findByNroDocumento(String nroDocumento) {
		return personaDao.findByNroDocumento(nroDocumento);
	}
}
