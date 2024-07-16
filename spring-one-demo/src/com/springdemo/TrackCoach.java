package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	//Created for fix no  args constructor error
	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		return "Run on hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Some what ok day " + fortuneService.getFortune();
	}

}
