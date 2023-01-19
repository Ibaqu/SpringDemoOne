package com.ibaqu.springdemo;

public class SwimmingCoach implements Coach {

	// Private field to hold dependency
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim a bit more";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
