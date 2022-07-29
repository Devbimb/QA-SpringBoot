package com.example.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Computer;
import com.example.interfaces.HDD;

//@Component("MyLenovo")
public class Lenovo implements Computer{
		@Autowired
		@Qualifier("Toshiba")
		HDD hdd; 
		
		public String storage() {
				return "This computer storage (HDD) was manufactured by  " + hdd.type();
		}
	}

