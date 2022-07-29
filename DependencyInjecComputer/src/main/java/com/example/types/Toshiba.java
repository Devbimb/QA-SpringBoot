package com.example.types;

import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;
@Component("ToshibaHDD")
public class Toshiba implements HDD{
	public String type() {
		return "Toshiba HDD designed by Upasana";
	}

}
