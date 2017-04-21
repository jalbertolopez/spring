package com.beeva.app.spring.core.utils;

import com.beeva.app.spring.core.figures.IFigura;

public class Calculadora {
	private IFigura figura;
	private String nombreFigura;
	
	Calculadora (String nombreFigura){
		System.out.println("///////// CONSTRUCTOR " + nombreFigura);
		this.nombreFigura = nombreFigura;
	}
	public void saludo() {
		System.out.println("//////// HOLA A TODOS  ///////");
	}

	public void despedida() {
		System.out.println("//////// ADIOS A TODOS  ///////");
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}
	

	public IFigura getFigura() {
		return figura;
	}

	public void setFigura(IFigura figura) {
		this.figura = figura;
	}

	public float calculaArea() {
		return figura.calculaArea();

	}
	

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	@Override
	public String toString() {
		return "Calculadora [figura=" + figura + "]";
	}
	
	
}
