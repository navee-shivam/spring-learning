package com.xml.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.service.PartsService;

public class CarDemoSetter {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		PartsService carParts = context.getBean("setInjection",PartsService.class);

		carParts.getEngine();

		carParts.getCarType();
	}

}
