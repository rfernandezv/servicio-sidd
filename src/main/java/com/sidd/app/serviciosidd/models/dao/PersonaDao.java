package com.sidd.app.serviciosidd.models.dao;

import com.sidd.app.serviciosidd.models.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{
        public List<Persona> findAll();
        public Persona findByNroDocumento(String nroDocumento);
}
