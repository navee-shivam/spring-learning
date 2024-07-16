package com.configuration.impl;

import org.springframework.stereotype.Component;

import com.configuration.service.PartsService;

@Component
public class Tata implements PartsService {

	@Override
	public void getEngine() {
		System.out.println("BS6 / 1999cc Petrol Tata Engine upgradable" );
	}

	@Override
	public void getCarType() {
		// TODO Auto-generated method stub

	}

}
