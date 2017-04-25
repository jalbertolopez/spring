package com.beeva.app.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.beeva.app.spring.batch.model.OperationBO;

public class Processor implements ItemProcessor<OperationBO, OperationBO> {
	private String jobParameter;
	
	public OperationBO process(OperationBO operation) throws Exception {
		System.out.println("Processing..." + operation + " >>>> " + this.jobParameter);
		return operation;
	}

	public String getJobParameter() {
		return jobParameter;
	}

	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}
	
}