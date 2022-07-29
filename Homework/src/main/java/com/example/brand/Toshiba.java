package com.example.brand;

import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;

@Component("myToshiba")
public class Toshiba implements HardDisk{
	public String storage() {
		return "This HDD has read write speed of 150 MBPS";
	}

}
