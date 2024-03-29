package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// without ComponentScan annotation Spring will only look for components in the current package
@ComponentScan("com.in28minutes")
public class Application {
	public static void main(String []args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
	}
}
