package com.beeva.app.spring.core.utils;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CalculadoraTest {
	
	private ApplicationContext context;
	private Calculadora cal;
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext(new String[] {
				"core-context.xml"});
		
		cal = context.getBean("calculadora",Calculadora.class);
	}
	
	@Test
	public void sumaTest() {
		int res = cal.suma(10, 10);
		assertEquals("10 + 10 = 20", res, 20);
	}

	@Test
	public void restaTest() {
		int res = cal.resta(10,10);
		assertEquals("10 - 10 = 0", res, 0);
	}
}