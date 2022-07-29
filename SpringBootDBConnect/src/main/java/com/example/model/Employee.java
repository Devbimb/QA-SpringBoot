package com.example.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//name of table will be Employee
@Entity
public class Employee {
	private int id;//identifier/ primary key
	private String name;
	private int age;
	private String address;
	private String email;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int id, String name, int age, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	public Employee() {
		super();
	}
	
	
}
