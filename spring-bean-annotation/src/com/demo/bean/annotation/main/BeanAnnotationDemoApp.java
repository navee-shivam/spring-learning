package com.demo.bean.annotation.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.annotation.interfaces.Coach;

public class BeanAnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Coach myCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(myCoach.getWorkoutTime());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
