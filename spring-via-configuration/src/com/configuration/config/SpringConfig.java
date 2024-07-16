package com.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.configuration.dependent.HatchbackModelType;
import com.configuration.dependent.SedanModelType;
import com.configuration.dependent.SuvModelType;
import com.configuration.impl.Mercedes;
import com.configuration.service.DesignTypeService;
import com.configuration.service.PartsService;

@Configuration
@ComponentScan("com.configuration")
public class SpringConfig {

	// Creation of dependency beans
	@Bean
	public DesignTypeService hatchbackModelType() {
		return new HatchbackModelType();
	}

	@Bean
	public DesignTypeService sedanModelType() {
		return new SedanModelType();
	}

	@Bean
	public DesignTypeService suvModelType() {
		return new SuvModelType();
	}

	// Injectables
	@Bean
	public PartsService mercedes(DesignTypeService suvModelType) {
		return new Mercedes(suvModelType());
	}

}
