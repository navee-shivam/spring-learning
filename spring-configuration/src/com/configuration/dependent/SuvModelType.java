package com.configuration.dependent;

import org.springframework.stereotype.Component;

import com.configuration.service.DesignTypeService;

@Component
public class SuvModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("SUV model type with 6 members");
	}

}
