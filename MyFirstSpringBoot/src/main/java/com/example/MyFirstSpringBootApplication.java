package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication  //contains 3 annotations
//Configuration +ComponentScan+EnableAutoConfiguration
public class MyFirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyFirstSpringBootApplication.class, args);
		Object byName = context.getBean("greeting");
		Object byType = context.getBean("String.class");
		Object byBoth = context.getBean("greeting", String.class);
		System.out.println(byName);
		System.out.println(byType);
	}
//    @Bean
//    public String greeting() {
//    	return "Hello, World";
 //   }	
}
