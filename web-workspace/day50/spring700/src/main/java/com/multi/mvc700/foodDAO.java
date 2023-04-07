package com.multi.mvc700;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class foodDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(foodVO bag) {
		int result =my.insert("food.insert",bag);
		return result;
	}
	
	public void delete(int no) {
		my.delete("food.del", no);
	}
	
	public void update(foodVO bag) {
		System.out.println(bag);
		my.update("food.up", bag);
	}
	
	public foodVO one(int no) {
		foodVO bag = my.selectOne("food.one", no);
		return bag;
	}
	
	public List<foodVO> list(){
		List<foodVO> list =my.selectList("food.list");
		return list;
	}
}
