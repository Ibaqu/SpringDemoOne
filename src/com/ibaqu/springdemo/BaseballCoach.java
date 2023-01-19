package com.ibaqu.springdemo;

public class BaseballCoach implements Coach {
	
	// Define a private field
	private FortuneService fortuneService;
	
	// Define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
