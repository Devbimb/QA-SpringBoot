package com.example.accountmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CustomerAct {
	private int id;
	private String name;
	private int actno;
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
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public CustomerAct() {
		super();
	}
	
}
