package com.beeva.app.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.beeva.app.spring.batch.model.OperationBO;

public class Processor implements ItemProcessor<OperationBO, OperationBO> {

	public OperationBO process(OperationBO operation) throws Exception {
		
		System.out.println("Processing..." + operation);
		return operation;
	}

}