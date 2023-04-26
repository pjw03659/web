package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDB확인문제 {

	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost",27017);
		
		MongoDatabase database = client.getDatabase("shop2");
		
		MongoCollection<Document> collection = database.getCollection("memo");
	
		//1.a insertOne
		/*Document doc = new Document();
		doc.append("name", "song");
		doc.append("age", 500);
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		collection.insertOne(doc);*/
		
		//1.b insertMany
		
	/*  Document doc = new Document();
		doc.append("name", "song2");
		doc.append("age", 501);
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		Document doc2 = new Document();
		doc2.append("name", "song3");
		doc2.append("age", 502);
		doc2.append("office", "busan");
		doc2.append("phone", "011");
		
		Document doc3 = new Document();
		doc3.append("name", "song4");
		doc3.append("age", 503);
		doc3.append("office", "busan");
		doc3.append("phone", "011");
		
		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);
		list.add(doc3);
		
		collection.insertMany(list); */
		
		//2.deleteOne
	/*	Document filter = new Document();
		filter.append("age", 500);
		
		collection.deleteOne(filter);
		client.close(); */
		
		//3. updateOne/updateMany
	/*  Document filter = new Document();
		filter.append("age", 501);
		Bson set = Updates.set("name","songsong");
		collection.updateOne(filter, set); */
		
		
		Document filter = new Document();
		filter.append("office", "busan");
		
		Bson set= Updates.set("phone", "9999");
		Bson set2= Updates.set("name", "songsong2");
		Bson set3= Updates.set("age", "555");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		list.add(set3);
		
		Bson setts = Updates.combine(list);
		
		collection.updateMany(filter, setts);
	}

}
