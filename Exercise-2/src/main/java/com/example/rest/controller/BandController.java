package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Band;
import com.example.rest.dto.BandDTO;
import com.example.service.BandService;

@RestController
public class BandController {
	private BandService bandservice;

	public BandController(BandService bandservice) {
		super();
		this.bandservice = bandservice;
	}

	@PostMapping("/Band/createband")
	public BandDTO createband(@RequestBody Band bd1) {
		return this.bandservice.createBand(bd1);
	}
		
	@GetMapping("/Band/readband")
	public List<BandDTO> readband(){
		return this.bandservice.readBand();
	}

	@PutMapping("/Band/updateband/{id}")
	public BandDTO update(@PathVariable long id,@RequestBody Band bd2){
	//public BandDTO update(@PathParam("id") Long id,@RequestBody Band bd2){
		return this.bandservice.updateBand(id, bd2);
	}
		
	@DeleteMapping("/Band/deleteband/{id}")
	public void delete (@PathVariable long id) {
		this.bandservice.deleteBand(id);
	}
	
	@GetMapping("/Band/readbdlistphone/{phone}")
	public List<Band> readbyPhone(@PathVariable long phone) {
		return this.bandservice.getBandbyPhone(phone);
	}
	
	@GetMapping("/Band/readbdlistname/{name}")
	public List<Band> readbyName(@PathVariable String name) {
		return this.bandservice.getBandbyName(name);
	}
		
	@GetMapping("/Band/test")
	public String test(){
		return "Hello there!";
	}	
	

}
