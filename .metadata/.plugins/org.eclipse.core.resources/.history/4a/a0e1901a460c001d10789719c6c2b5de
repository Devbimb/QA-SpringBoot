package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.computer.HP;
import com.example.computer.Lenovo;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
	@Bean("MyLenovo")
	public Lenovo lenv()
	{
		return new Lenovo();
	}
	@Bean("MyHP")
	public HP hp()
	{
		return new HP();
	}
}
