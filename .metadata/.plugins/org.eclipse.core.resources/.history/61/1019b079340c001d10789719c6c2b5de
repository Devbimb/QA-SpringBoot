package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;
import com.example.interfaces.Engine;

//@Component("MyBMW")
public class BMW implements Car{
		@Autowired
		@Qualifier("V8Engine")
		Engine eng; //new Engine();
		
		public String spec() {
				return "This is SUV with engine type as " + eng.type();
		}
	}

