package com.multi.www.web07;

public class MainCar3 {

	public static void main(String[] args) {
		Car2 car2;
		
		for (int i = 0; i < 1000; i++) {
			car2 = Car2.getInstance();
			System.out.println(car2);
		}
	
	}

}
