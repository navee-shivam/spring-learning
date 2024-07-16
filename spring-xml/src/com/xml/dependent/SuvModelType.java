package com.xml.dependent;

import com.xml.service.DesignTypeService;

public class SuvModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("SUV model type with 6 members");
	}

}
