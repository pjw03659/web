package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient client = new MongoClient("localhost",27017);
		//2.shop2db로 연결
		MongoDatabase database=client.getDatabase("shop2");
		System.out.println("2.shop2");
		
		//3.memeber컬렉션에 연결
		MongoCollection<Document> collection=database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결 성공");
		
		FindIterable<Document> list = collection.find();//전체 검색
		
		ArrayList<MemberVO> result= new ArrayList<MemberVO>();
		
		for(Document document : list) {
			//System.out.println(document);
			MemberVO bag = new MemberVO();
			bag.setId(document.getString("id"));
			bag.setPw(document.getString("pw"));
			bag.setName(document.getString("name"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		
		System.out.println(result);
		
		
	}

}
