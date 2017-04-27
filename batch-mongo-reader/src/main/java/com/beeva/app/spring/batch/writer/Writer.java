package com.beeva.app.spring.batch.writer;

import java.util.List;
import org.springframework.batch.item.ItemWriter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class Writer implements ItemWriter <BasicDBObject> {
	private DBCollection mongo;
	
	public void write(List<? extends BasicDBObject> ops) throws Exception {	
		for (BasicDBObject op : ops){
			System.out.println("Persitiendo en MongoDB el documento.... "+ op );
			mongo.insert(op);
		}	
	}

	
	public DBCollection getMongo() {
		return mongo;
	}


	public void setMongo(DBCollection mongo) {
		this.mongo = mongo;
	}


	public void destroy(){
		mongo.getDB().getMongo().close();
	}
}
