package com.annotation.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.service.PartsService;

public class CarDemoApp {

	public static void main(String[] args) {

		//Load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		//get the bean from IOC
		//For casting purpose
		PartsService partsService = context.getBean("mercedes" , PartsService.class);

		//getEngine type
		partsService.getEngine();

		//getCarType
		partsService.getCarType();
	}

}
