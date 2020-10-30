package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Persona;
import com.example.service.PersonasService;

/**
 * En esta clase se expone el servicios REST con cada operacion del CRUD
 * @author Administrador
 *
 */


@RestController
public class PersonasRest {
	
	

	@Autowired
	CreatePersonas createPersona;
	
	@GetMapping("/crearPersona")
	public List<Persona> crearPersona(){
		
	   
	   createPersona.crearPersona();
		return createPersona.buscarPersonas();
	}
	
	
	@GetMapping("/encontrarPersona")
	public Persona encontrarPersona(@RequestParam String id){
		
		
		return createPersona.encontrarPersona(id);
	}
	
	@GetMapping("/buscarPersonas")
	public List<Persona> buscarPersonas(){
		
		
		return createPersona.buscarPersonas();
	}
	

    
	@RequestMapping(value = "/guardarPersona", method = RequestMethod.POST)
	public Persona guardarPersona(@RequestBody Persona persona){
		
		 return createPersona.guardarPersona(persona);
	}
	
    
	@PutMapping("/editarPersona")
	public Persona editarPersona (@RequestBody Persona persona){
	
		return createPersona.editarPersona(persona);
		
	}
	
	
	@PatchMapping("/borrarPersona")
	public String borrarPersona(@RequestBody String id){
	
		return createPersona.borrarPersona(id);	
	}
	

	
}
