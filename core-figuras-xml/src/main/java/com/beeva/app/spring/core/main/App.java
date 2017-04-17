package com.beeva.app.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.spring.core.utils.Calculadora;



public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"core-context.xml"});
		Calculadora c = context.getBean("calculadora",Calculadora.class);
		for (int i = 0 ; i< args.length; i++){
			System.out.println( i + " >> " + args[i]);
		}
		
		if (args[0].compareTo("triangulo") == 0){
			System.out.println("resultado = " + c.calculaArea(args[0]));
		} else if (args[0].compareTo("rectangulo") == 0){
			System.out.println("resultado = " + c.calculaArea(args[0]));
		} else {
			System.out.println("/////// OPCIÓN INVÁLIDA ////////");
		}
		((AbstractApplicationContext) context).close();
		
	}

}
