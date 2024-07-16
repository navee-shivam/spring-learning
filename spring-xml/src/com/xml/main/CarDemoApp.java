package com.xml.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.service.PartsService;

public class CarDemoApp {

	public static void main(String[] args) {

		//Load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		//get the bean from IOC
		//For casting purpose
		PartsService partsService = context.getBean("carParts" , PartsService.class);

		//getEngine type
		partsService.getEngine();

		//getCarType
		partsService.getCarType();
	}

}
