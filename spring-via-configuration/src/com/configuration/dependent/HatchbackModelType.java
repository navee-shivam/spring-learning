package com.configuration.dependent;

import org.springframework.stereotype.Component;

import com.configuration.service.DesignTypeService;

@Component
public class HatchbackModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("Hatchback model type with 4 members");
	}

}
