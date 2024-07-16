package com.configuration.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.configuration.service.DesignTypeService;
import com.configuration.service.PartsService;

public class Mercedes implements PartsService {

	private DesignTypeService designTypeService;

	public Mercedes(DesignTypeService designTypeService) {
		//Assigining reference variable to the designTypeservice
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
