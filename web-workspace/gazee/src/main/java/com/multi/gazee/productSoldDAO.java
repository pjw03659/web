package com.multi.gazee;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class productSoldDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert() {
		
	}
}
