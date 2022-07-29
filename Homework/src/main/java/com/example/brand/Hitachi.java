package com.example.brand;

import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;
@Component("myHitachi")
public class Hitachi implements HardDisk{
	public String storage() {
		return "with HDD with read write speed of 100MBPS";
	}

}
