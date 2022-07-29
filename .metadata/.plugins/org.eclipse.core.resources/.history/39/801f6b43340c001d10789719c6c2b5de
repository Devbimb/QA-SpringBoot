package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.interfaces.Car;

@SpringBootApplication
public class DependecyInjection {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar=context.getBean("MyBMW",Car.class);
        System.out.println(myCar.spec());
        
        Car yourCar=context.getBean("MyMerc",Car.class);
        System.out.println(yourCar.spec());
	}

}
