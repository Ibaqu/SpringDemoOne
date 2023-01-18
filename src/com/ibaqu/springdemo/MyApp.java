package com.ibaqu.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BaseballCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
