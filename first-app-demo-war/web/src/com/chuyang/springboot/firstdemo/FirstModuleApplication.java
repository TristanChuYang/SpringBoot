package com.chuyang.springboot.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FirstModuleApplication extends SpringBootServletInitializer {


	//重写SpringBootServletInitializer的configure方法
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FirstModuleApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstModuleApplication.class, args);
	}

}
