package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.interfaces.Computer;

//@SpringBootApplication
public class DependencyInjecComputer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Computer myComputer=context.getBean("MyHP",Computer.class);
        System.out.println(myComputer.storage());
        
        Computer yourComputer=context.getBean("MyLenovo",Computer.class);
        System.out.println(yourComputer.storage());
	}

}
