package com.configuration.dependent;

import org.springframework.stereotype.Component;

import com.configuration.service.DesignTypeService;

@Component
public class SedanModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("Sedan model type with 4 members");
	}

}
