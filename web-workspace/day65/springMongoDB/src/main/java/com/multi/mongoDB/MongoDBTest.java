package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient client = new MongoClient("localhost",27017);
		//2.shop2db로 연결
		MongoDatabase database=client.getDatabase("shop2");
		System.out.println("2.shop2");
		
		//3.memeber컬렉션에 연결
		MongoCollection<Document> collection=database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결 성공");
		
		
		Document doc = new Document();
		doc.append("id", "apple");
		doc.append("pw", "apple");
		doc.append("name", "apple");
		doc.append("tel", "apple");
		
		Document doc2 = new Document();
		doc2.append("id", "apple");
		doc2.append("pw", "apple");
		doc2.append("name", "apple");
		doc2.append("tel", "apple");
		
		
		//ArrayList<Document> list = new ArrayList<Document>();
		List<Document> list= new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);
		
		collection.insertMany(list);
		System.out.println("4. member 컬렉션에 성공");
	}

}
