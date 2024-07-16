package com.demo.bean.annotation.Impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.demo.bean.annotation.interfaces.Coach;
import com.demo.bean.annotation.interfaces.FortuneService;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("randomFortunesFromFileServiceImpl")
	private FortuneService fortuneService;

	/**
	 * //Constructor injection
	 *
	 * @Autowired public CricketCoach(FortuneService fortuneService) {
	 *            this.fortuneService = fortuneService; }
	 */
	public CricketCoach() {
		System.out.println("CricketCoach Default Constructor");
	}

	// Define Setter Injectiton
	// @Autowired
	// public void setFortuneService(FortuneService paramFortuneService) {
	// System.out.println("CricketCoach setter injection setFortuneService()");
	// fortuneService = paramFortuneService;
	// }

	@Override
	public String getWorkoutTime() {
		return "Practice Bowling upto 2hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
