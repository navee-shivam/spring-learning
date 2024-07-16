package com.demo.bean.annotation.Impl;

import com.demo.bean.annotation.interfaces.Coach;
import com.demo.bean.annotation.interfaces.FortuneService;

public class Swimcoach implements Coach {

	private FortuneService fortuneService;

	public Swimcoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getWorkoutTime() {
		return "swim for 100 yards ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
