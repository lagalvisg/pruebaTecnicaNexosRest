package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Persona;
import com.example.service.PersonasService;


/**
 * Esta clase define el CRUD para la base de datos mongoDB, que apunta a la base de datos
 * personas. hace uso del servicio de base de datos de Spring
 * @author Administrador
 *
 */
@Service
public class CreatePersonas {
	

	@Autowired
	PersonasService personasService;
	
	private static Logger logger = LogManager.getLogger(CreatePersonas.class);
	
/**
 * Metodo para crear una persona de ejemplo, ver como el nucleo familiar se compone
 * de una lista de personas
 * @return
 */
	
	public Persona crearPersona() {
		logger.error("guardarPersona");
		
		boolean save = false;
		Date fecha = new Date();
		
		Persona persona = new Persona();
		
		persona.setApellido("Galvis");
		persona.setNombre("Luis");
		persona.setTipoDocumento("CC");
		persona.setNroDocumento("1014196481");
		persona.setEdad("32");
		persona.setSexo("M");
		persona.setFechaNacimiento("1988/11/15");
		persona.setNacionalidad("Colombiana");
		persona.setParentesco("");
		
		
		Persona pariente = new Persona();
		
		pariente.setApellido("Galvis");
		pariente.setNombre("Carlos");
		pariente.setTipoDocumento("TI");
		pariente.setNroDocumento("88111555600");
		pariente.setEdad("15");
		pariente.setSexo("M");
		pariente.setFechaNacimiento("2020/04/04");
		pariente.setNacionalidad("Colombiana");
		pariente.setParentesco("hijo");
		List<Persona> nucleoF = new ArrayList<>();
		nucleoF.add(pariente);
		
		persona.setNucleoFamiliar(nucleoF);
		
		 personasService.save(persona);
	
		logger.error("guardarPersona ejecutado");
		
		
		return persona;
	}
	
	
public List <Persona> buscarPersonas() {
		List<Persona> listPersonas = new ArrayList<>();
		try {
		
		
		
		listPersonas = personasService.findAll();
	
		logger.warn("se realizo busqueda de personas");
		}catch(Exception e) {
			logger.error("error al buscarPersonas: "+e.getMessage());
		}
		
		return listPersonas;
	}

	
	
public Persona guardarPersona(Persona persona) {
		
		try {
		
		
			String id = persona.getNroDocumento();
		 personasService.save(persona);
	
		logger.warn("se guardo a la persona con NrDocumento: "+ id);
		}catch(Exception e) {
			logger.error("error al guardarPersona: "+e.getMessage());
		}
		
		return persona;
	}
	
	public Persona encontrarPersona(String id) {
	Persona persona = new Persona();
		
		try {
		 
			persona = personasService.findPersonaByNroDocumento(id);
	
		logger.warn("se busco a la persona con NrDocumento: "+id);
		}catch(Exception e) {
			logger.error("error al encontrarPersona: "+e.getMessage());
		}
		
		return persona;
	}
	
	public Persona editarPersona(Persona persona) {
		
		try {
		
		
			String id = persona.getNroDocumento();
		 personasService.save(persona);
	
		logger.warn("se edito a la persona con NrDocumento: "+ id);
		}catch(Exception e) {
			logger.error("error al editarPersona: "+e.getMessage());
		}
		
		return persona;
	}
	
	public String borrarPersona(String id) {
		String borrado = "NO se ha borrado";
		try {
		
		 personasService.deleteById(id);
		 borrado = "Se ha borrado la persona con id: "+id;
	     
		logger.warn("se busco a la persona con NrDocumento: "+id);
		}catch(Exception e) {
			logger.error("error al encontrarPersona: "+e.getMessage());
		}
		
		return borrado;
	}
	
	
	
	
	
	
}
