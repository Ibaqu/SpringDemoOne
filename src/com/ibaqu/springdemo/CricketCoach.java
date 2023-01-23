package com.ibaqu.springdemo;

public class CricketCoach implements Coach {
	
	// Dependency definition
	private FortuneService fortuneService;
	
	// add new fields for email add and team
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	private String team;
	
	// Create constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// Setter method called by spring
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
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
