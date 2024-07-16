package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// Add new fields for email and team name
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setter method - setTeam");
		this.team = team;
	}

	// create no args constructor
	public CricketCoach() {
		System.out.println("CricketCoach : Inside no-args constructor");
	}

	// create a setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		return "Practice bowling for 1 hr";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
