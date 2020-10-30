package com.example.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Persona;

@Repository
public interface PersonasService extends MongoRepository<Persona,String> {

	public List<Persona> findAll();
	public Persona findPersonaByNroDocumento(String nroDocumento);
	

}
