package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="persona")
public class Persona {
	
	
	private String nombre ="";
	private String apellido ="";
	private String sexo ="";
	private String edad ="";
	private String nacionalidad ="";
	@Id
	private String nroDocumento = "";
	private String tipoDocumento = "";
	private String fechaNacimiento = "";
	private String parentesco = "";
	
	private List<Persona> nucleoFamiliar = new ArrayList<>();
	
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String getEdad() {
		return edad;
	}




	public void setEdad(String edad) {
		this.edad = edad;
	}




	public String getNacionalidad() {
		return nacionalidad;
	}




	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}




	public String getNroDocumento() {
		return nroDocumento;
	}




	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}




	public String getTipoDocumento() {
		return tipoDocumento;
	}




	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}









	public String getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	public String getParentesco() {
		return parentesco;
	}




	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}




	public List<Persona> getNucleoFamiliar() {
		return nucleoFamiliar;
	}




	public void setNucleoFamiliar(List<Persona> nucleoFamiliar) {
		this.nucleoFamiliar = nucleoFamiliar;
	}
	
	
}
