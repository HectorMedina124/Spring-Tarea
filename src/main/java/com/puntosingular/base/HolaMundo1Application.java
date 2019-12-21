package com.puntosingular.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@SpringBootApplication
//@ComponentScan(basePackages= {"com.puntosingular.base.controller"})
public class HolaMundo1Application {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundo1Application.class, args);
	}

}
