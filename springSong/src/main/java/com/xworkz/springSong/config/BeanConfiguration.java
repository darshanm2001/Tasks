package com.xworkz.springSong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan("com.xworkz.springSong")
@EnableWebMvc
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Creating BeanConfiguration");
	}
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Invoking viewResolver ");
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
	
	
}


