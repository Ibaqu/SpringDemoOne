package com.ibaqu.springdemo;

public class CricketCoach implements Coach {
	
	// Dependency definition
	private FortuneService fortuneService;
	
	// Create constructor
	public CricketCoach() {
		System.out.println("CricketCoack : inside no-arg constructor");
	}
	
	// Setter method called by spring
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoack : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play some more cricket";
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
