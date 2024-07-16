package com.xml.impl;

import com.xml.service.DesignTypeService;
import com.xml.service.PartsService;

public class Toyata implements PartsService {

	private DesignTypeService designTypeService;


	public Toyata() {
		System.out.println("SUPERRR");
	}

	@Override
	public void getEngine() {
		System.out.println("BS6 / 2487cc Petrol Toyata Engine non-upgradable");
	}

	@Override
	public void getCarType() {
		designTypeService.getModelType();
	}

	public void setAaa(DesignTypeService designTypeService){
		System.out.println("HAi");
		this.designTypeService = designTypeService;
	}
}
