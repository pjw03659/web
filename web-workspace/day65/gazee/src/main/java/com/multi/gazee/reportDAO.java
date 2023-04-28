package com.multi.gazee;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class reportDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(reportVO bag) {
		my.insert("report.create", bag);
	}
	
	public void delete(reportVO bag) {
		my.delete("report.del", bag);
	}
	
	public void update(reportVO bag) {
		my.update("report.up", bag);
	}
	
	public reportVO one(int no) {
		reportVO bag = my.selectOne("report.one",no);
		System.out.println(bag);
		return bag;
	}

	public List<reportVO> list(){
		List<reportVO> list = my.selectList("report.all");
		return list;
	}
	
	public List<reportVO> category(String category1){
		List<reportVO> category = my.selectList("report.category",category1);
		return category;
	}
	
}
