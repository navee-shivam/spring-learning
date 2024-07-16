package com.demo.bean.annotation.Impl;

import org.springframework.stereotype.Component;

import com.demo.bean.annotation.interfaces.FortuneService;

@Component
public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Have a Lucky day";
	}

}
