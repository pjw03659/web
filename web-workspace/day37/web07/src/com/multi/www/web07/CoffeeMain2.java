package com.multi.www.web07;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c1;
		Coffee2 c2;
		
		c1 = Coffee2.getInstance();
		c2 = Coffee2.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
