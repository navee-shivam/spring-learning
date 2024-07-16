package com.springdemo;

public class BaseballCoach implements Coach {

	// defines a private fieldfor dependency
	private FortuneService fortuneService;

	// define constructor for DI
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWork() {
		return "Spend 1 hr on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
