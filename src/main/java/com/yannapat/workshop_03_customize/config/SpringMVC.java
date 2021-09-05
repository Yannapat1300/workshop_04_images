package com.yannapat.workshop_03_customize.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class SpringMVC implements WebMvcConfigurer {

	 public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/static/");
	    }

}