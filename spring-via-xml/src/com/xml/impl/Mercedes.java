package com.xml.impl;

import com.xml.service.DesignTypeService;
import com.xml.service.PartsService;

public class Mercedes implements PartsService {

	//root .....
	private DesignTypeService designTypeService;

	//constructor DI
	public Mercedes(DesignTypeService designTypeService) {
//		Assigining reference variable to the designTypeservice
		this.designTypeService = designTypeService;
	}

	@Override
	public void getEngine() {
		System.out.println("BS6 / 2925cc Diesel Benz Engine upgradable" );
	}

	@Override
	public void getCarType() {
		designTypeService.getModelType();
	}

}
