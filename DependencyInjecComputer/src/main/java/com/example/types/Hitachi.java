package com.example.types;

import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;
@Component("HitachiHDD")
public class Hitachi implements HDD {
	public String type() {
		return "Hitachi HDD designed by Bimbo ";
	}

}
