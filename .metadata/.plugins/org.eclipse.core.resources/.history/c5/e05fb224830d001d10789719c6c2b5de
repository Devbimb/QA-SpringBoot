package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;
import com.example.interfaces.Laptop;

@Component("mySony")
public class Sony implements Laptop{
	@Autowired
	@Qualifier("myHitachi")
	HardDisk hdd;
	public  void configuration()
	{
		System.out.println("A Dell laoptop which has "+hdd.storage());
	}

}
