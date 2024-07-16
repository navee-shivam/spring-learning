package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",
				CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getDailyFortune());

		// call our new methods inject literal values
		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}

}
