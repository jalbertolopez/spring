package com.beeva.app.spring.core.figures;

public class Rectangulo implements IFigura{
	private float base;
	private float altura;
	private String nombre;
	
	
	public Rectangulo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public float calculaArea() {
		System.out.println("<< CALCULANDO AREA DE UN " + this.nombre +" >>");
		return this.base * this.altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
