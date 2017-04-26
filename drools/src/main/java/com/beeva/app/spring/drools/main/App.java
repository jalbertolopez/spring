package com.beeva.app.spring.drools.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beeva.app.spring.drools.model.Cliente;
import com.beeva.app.spring.drools.run.RuleRunner;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"drools-xls-context.xml"});
		
		RuleRunner ruleRunner = context.getBean("ruleRunner",RuleRunner.class);
		
		Cliente c = new Cliente();
		c.setNombres(args[0]);
		c.setApellidos(args[1]);
		c.setSexo(args[2]);
		c.setMontoAcumulado(Float.parseFloat(args[3]));
		try {
			ruleRunner.runRules(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) context).close();
		
	}

}
