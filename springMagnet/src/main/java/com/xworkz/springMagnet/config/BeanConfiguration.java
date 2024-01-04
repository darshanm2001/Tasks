package com.xworkz.springMagnet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.springMagnet")
@EnableWebMvc
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Invoking BeanConfiguration....");
	}
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Invoking viewResolver().....");
		ViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}

}
