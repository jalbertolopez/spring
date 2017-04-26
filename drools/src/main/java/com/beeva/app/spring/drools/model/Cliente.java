package com.beeva.app.spring.drools.model;

public class Cliente {
	private String nombres;
	private String apellidos;
	private String sexo;
	private float montoAcumulado;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getMontoAcumulado() {
		return montoAcumulado;
	}
	public void setMontoAcumulado(float montoAcumulado) {
		this.montoAcumulado = montoAcumulado;
	}
	
	public void printAlert(String message){
		System.out.println("/////////////" + message + "/////////////");
	}
	
	@Override
	public String toString() {
		return "Cliente [nombres=" + nombres + ", apellidos=" + apellidos + ", sexo=" + sexo + ", montoAcumulado="
				+ montoAcumulado + "]";
	}
}
