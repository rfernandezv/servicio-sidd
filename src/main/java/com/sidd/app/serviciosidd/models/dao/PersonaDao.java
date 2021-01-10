package com.sidd.app.serviciosidd.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.sidd.app.serviciosidd.models.entity.Persona;



public interface PersonaDao extends CrudRepository<Persona, Long>{

}
