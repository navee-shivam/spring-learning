package com.annotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.annotation.service.DesignTypeService;
import com.annotation.service.PartsService;

@Component
public class Mercedes implements PartsService {

	private DesignTypeService designTypeService;

	//@Qualifier used for recogonizing the bean
	@Autowired
	public Mercedes(@Qualifier("hatchbackModelType")DesignTypeService designTypeService) {
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
