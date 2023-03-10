package com.ibaqu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
