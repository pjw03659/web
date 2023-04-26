package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_update2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient client = new MongoClient("localhost",27017);
		//2.shop2db로 연결
		MongoDatabase database=client.getDatabase("shop2");
		System.out.println("2.shop2");
		
		//3.memeber컬렉션에 연결
		MongoCollection<Document> collection=database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결 성공");
		
		
		Document filter = new Document();
		filter.append("id", "apple4");
		
		Bson set = Updates.set("name", "winwinwin");
		
		collection.updateOne(filter, set);
		System.out.println("4. member 컬렉션에 성공");
	}

}
