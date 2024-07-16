package com.configuration.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.config.SpringConfig;
import com.configuration.service.PartsService;

public class CarDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfig.class);
		PartsService partsService = context.getBean("mercedes", PartsService.class);
		partsService.getEngine();
		partsService.getCarType();
	}

}
