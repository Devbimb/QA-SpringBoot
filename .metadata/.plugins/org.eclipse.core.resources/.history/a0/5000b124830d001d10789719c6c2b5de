package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.interfaces.Laptop;

//@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HomeworkApplication.class, args);
		AnnotationConfigApplicationContext context=	new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop myLaptop=context.getBean("mySony",Laptop.class);
	    myLaptop.configuration();
		
		
	}

}
