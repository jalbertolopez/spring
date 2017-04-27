package com.beeva.app.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.beeva.app.spring.batch.model.OperationBO;
import com.mongodb.BasicDBObject;

public class Processor implements ItemProcessor<OperationBO, BasicDBObject> {
	private String jobParameter;
	
	public BasicDBObject process(OperationBO operation) throws Exception {
		System.out.println("Processing..." + operation + " >>>> " + this.jobParameter);
		BasicDBObject document = new BasicDBObject();
		document.put("nombre", operation.getNombre());
		document.put("apellido", operation.getApellido());
		document.put("edad", operation.getEdad());
		document.put("sexo", operation.getSexo());
		return document;
	}

	public String getJobParameter() {
		return jobParameter;
	}

	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}
	
}