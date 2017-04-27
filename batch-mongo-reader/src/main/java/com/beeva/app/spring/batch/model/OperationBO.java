package com.beeva.app.spring.batch.model;

public class OperationBO {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public OperationBO(String nombre, String apellido, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public OperationBO() {
		super();
	}
	@Override
	public String toString() {
		return "OperationBO [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
}
