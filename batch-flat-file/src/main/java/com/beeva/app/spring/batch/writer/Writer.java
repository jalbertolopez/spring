package com.beeva.app.spring.batch.writer;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import com.beeva.app.spring.batch.model.OperationBO;

public class Writer implements ItemWriter <OperationBO> {

	public void write(List<? extends OperationBO> ops) throws Exception {
		// TODO LOGICA DE PERSISTENCIA 
		for (OperationBO op : ops){
			System.out.println("Writting.... "+ op );
		}
	}

}
