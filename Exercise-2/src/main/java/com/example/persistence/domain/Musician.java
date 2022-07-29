package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 55)
    private String name;

    @Min(0)
    @Max(12)
    private Long strings;

    @NotNull
    private String type;

    @ManyToOne
    private Band band;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getStrings() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBand() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setStrings(Object strings2) {
		// TODO Auto-generated method stub
		
	}

	public void setType(Object type2) {
		// TODO Auto-generated method stub
		
	}

	public void setBand(Object band2) {
		// TODO Auto-generated method stub
		
	}

    // constructors

    // getters & setters
}