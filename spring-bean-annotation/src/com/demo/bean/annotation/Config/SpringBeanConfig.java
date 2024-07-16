package com.demo.bean.annotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.annotation.Impl.RandomFortuneServiceImpl;
import com.demo.bean.annotation.Impl.Swimcoach;
import com.demo.bean.annotation.interfaces.Coach;
import com.demo.bean.annotation.interfaces.FortuneService;

@Configuration
public class SpringBeanConfig {

	@Bean
	public FortuneService randomFortuneServiceImpl(){
		return new RandomFortuneServiceImpl();
	}

	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new Swimcoach(randomFortuneServiceImpl());
	}
}
