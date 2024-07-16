package com.annotation.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.service.PartsService;

public class CarDemoSetter {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		PartsService carParts = context.getBean("toyata",PartsService.class);

		carParts.getEngine();

		carParts.getCarType();
	}

}
