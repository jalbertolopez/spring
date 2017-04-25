package com.beeva.app.spring.barch.persistence;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDB {
	private String host;
	private int port;
	private String db;
	private String collection;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	public DBCollection getMongoConexion(){
		MongoClient mongoClient = new MongoClient( this.host , this.getPort() );
		DB db = mongoClient.getDB(this.db);
		return db.getCollection(this.collection);
	}
	
	
}
