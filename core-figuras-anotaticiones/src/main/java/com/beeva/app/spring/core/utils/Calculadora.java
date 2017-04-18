package com.beeva.app.spring.core.utils;
import com.beeva.app.spring.core.figures.IFigura;

public class Calculadora {
	private IFigura triangulo;
	private IFigura rectangulo;
	
	public void saludo(){
		System.out.println("//////// HOLA A TODOS  ///////");
	}
	
	public void despedida(){
		System.out.println("//////// ADIOS A TODOS  ///////");
	}
	
	public int suma(int a, int b){
		return a + b;
	}
	
	public int resta(int a, int b){
		return a - b;
	}

	public void setTriangulo(IFigura triangulo) {
		this.triangulo = triangulo;
	}
	
	public void setRectangulo(IFigura rectangulo) {
		this.rectangulo = rectangulo;
	}

	public float calculaArea(String opc){
		if (opc.compareTo("rectangulo") == 0 ){
			return rectangulo.calculaArea();
		} else if (opc.compareTo("triangulo") == 0) {
			return triangulo.calculaArea();
		} else {
			return 0;
		}
	}
}
