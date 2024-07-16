package com.demo.bean.annotation.Impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.demo.bean.annotation.interfaces.FortuneService;

@Component
public class RandomFortuneServiceImpl implements FortuneService {

	private String[] fortuneArray = { "Have a lucky day",
			"Beware of your activities", "Money loss in investment !Bad day",
			"Trust wins" };

	private Random randomIndex = new Random();

	@Override
	public String getDailyFortune() {
		int index = randomIndex.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}

}
