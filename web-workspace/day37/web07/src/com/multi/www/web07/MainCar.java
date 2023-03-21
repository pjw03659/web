package com.multi.www.web07;

public class MainCar {

	public static void main(String[] args) {
		Car car;
		
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강"+i, 10, 200);
			System.out.println(car);
		}
	
	}

}
