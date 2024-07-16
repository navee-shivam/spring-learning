package com.annotation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.annotation.service.DesignTypeService;
import com.annotation.service.PartsService;

@Component
public class Toyata implements PartsService {

	private DesignTypeService designTypeService;

	@Override
	public void getEngine() {
		System.out.println("BS6 / 2487cc Petrol Toyata Engine non-upgradable");
	}

	@Override
	public void getCarType() {
		designTypeService.getModelType();
	}

	@Autowired
	@Qualifier("suvModelType")
	public void setSuvModelType(DesignTypeService designTypeService){
		this.designTypeService = designTypeService;
	}
}
