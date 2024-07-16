package com.demo.bean.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.annotation.Config.SpringBeanConfig;
import com.demo.bean.annotation.interfaces.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		Coach myCoach = context.getBean("swimCoach", Coach.class);
		System.out.println(myCoach.getWorkoutTime());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
