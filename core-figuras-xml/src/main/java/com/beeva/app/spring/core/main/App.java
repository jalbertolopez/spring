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
	
		System.out.println("--> AREA =" + c.calculaArea());
		
		((AbstractApplicationContext) context).close();
		
	}

}
