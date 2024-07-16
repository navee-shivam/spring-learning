package com.annotation.dependent;

import org.springframework.stereotype.Component;

import com.annotation.service.DesignTypeService;

@Component
public class SedanModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("Sedan model type with 4 members");
	}

}
