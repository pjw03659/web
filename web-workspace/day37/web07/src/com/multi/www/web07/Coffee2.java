package com.multi.www.web07;

public class Coffee2 {
	int price;
	String name;
	
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		if(coffee2== null) {
			coffee2 = new Coffee2(100, "starbucks");
		}
		return coffee2;
	}
	
	
	public Coffee2(int price, String name) {
	
		this.price = price;
		this.name = name;
	}
	
}
