package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_find2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient client = new MongoClient("localhost",27017);
		//2.shop2db로 연결
		MongoDatabase database=client.getDatabase("shop2");
		System.out.println("2.shop2");
		
		//3.memeber컬렉션에 연결
		MongoCollection<Document> collection=database.getCollection("memo");
		System.out.println("3.member 컬렉션에 연결 성공");
		
		FindIterable<Document> list = collection.find();//전체 검색
		
		ArrayList<MemoVO> result= new ArrayList<MemoVO>();
		
		for(Document document : list) {
			//System.out.println(document);
			MemoVO bag = new MemoVO();
			bag.setName(document.getString("name"));
			bag.setAge(document.getInteger("age"));
			bag.setOffice(document.getString("office"));
			bag.setPhone(document.getString("phone"));
			result.add(bag);
		}
		
		System.out.println(result);
		
		
	}

}
