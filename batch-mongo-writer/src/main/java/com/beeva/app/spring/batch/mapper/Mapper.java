package com.beeva.app.spring.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.beeva.app.spring.batch.model.OperationBO;


public class Mapper implements FieldSetMapper<OperationBO> {
	
	
	public OperationBO mapFieldSet(FieldSet fieldSet) throws BindException {
		
		OperationBO report = new OperationBO();
		report.setNombre(fieldSet.readString(0));
		report.setApellido(fieldSet.readString(1));
		report.setEdad(fieldSet.readInt(2));
		report.setSexo(fieldSet.readString(3));
		return report;
	}


}