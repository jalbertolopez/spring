package com.beeva.app.spring.core.main;

import org.springframework.context.ApplicationContext;
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
		
		if (args[0].compareTo("suma") == 0){
			System.out.println("resultado = " + c.suma(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
		} else if (args[0].compareTo("resta") == 0){
			System.out.println("resultado = " + c.resta(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
		} else {
			System.out.println("/////// OPCIÓN INVÁLIDA ////////");
		}
	}

}
