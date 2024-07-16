package com.xml.dependent;

import com.xml.service.DesignTypeService;

public class SedanModelType implements DesignTypeService {

	@Override
	public void getModelType() {
		System.out.println("Sedan model type with 4 members");
	}

}
