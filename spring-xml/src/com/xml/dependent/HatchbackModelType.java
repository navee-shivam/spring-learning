package com.xml.dependent;

import com.xml.service.DesignTypeService;

public class HatchbackModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("Hatchback model type with 4 members");
	}

}
