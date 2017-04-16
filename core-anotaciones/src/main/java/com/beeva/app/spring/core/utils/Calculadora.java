package com.beeva.app.spring.core.utils;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
	public int suma(int a, int b){
		return a + b;
	}
	
	public int resta(int a, int b){
		return a - b;
	}

}
