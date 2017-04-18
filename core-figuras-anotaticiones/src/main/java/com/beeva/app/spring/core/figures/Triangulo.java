package com.beeva.app.spring.core.figures;

public class Triangulo implements IFigura{
	private float base;
	private float altura;
	private String nombre;
	
	public Triangulo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public float calculaArea() {
		System.out.println("<< CALCULANDO AREA DE UN " + this.nombre +" >>");
		return (this.base * this.altura)/2;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
