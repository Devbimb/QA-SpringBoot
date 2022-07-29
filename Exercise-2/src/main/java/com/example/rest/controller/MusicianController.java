package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Musician;
import com.example.rest.dto.MusicianDTO;
import com.example.service.MusicianService;


@RestController
public class MusicianController {
	private MusicianService musicianservice;

	public MusicianController(MusicianService musicianservice) {
		super();
		this.musicianservice = musicianservice;
	}

	@PostMapping("/createmusicians")
	public MusicianDTO createmusician(@RequestBody Musician mu1) {
		return this.musicianservice.addMusician(mu1);
	}
		
	@GetMapping("/readmusician")
	public List<MusicianDTO> readmusician(){
		return this.musicianservice.readMusician();
	}

	@PutMapping("/updatemusician/{id}")
	public MusicianDTO updatemusician(@PathVariable long id,@RequestBody Musician mu2){
		return this.musicianservice.updateMusician(id, mu2);
	}
		
	@DeleteMapping("/deletemusician/{id}")
	public void delete (@PathVariable long id) {
		this.musicianservice.deleteMusician(id);
	}
	
	@GetMapping("/readmulistname/{name}")
	public List<Musician> readbyName (@PathVariable String name) {
		return this.musicianservice.getMusicianByName(name);
	}
	
	@GetMapping("/readmuliststrings/{strings}")
	public List<Musician> readbyStrings(@PathVariable Long strings) {
		return this.musicianservice.getMusicianByStrings(strings);
	}
		
	@GetMapping("/readmulisttype/{type}")
	public List<Musician> readbyType(@PathVariable String type) {
		return this.musicianservice.getMusicianByType(type);
	}	
	@GetMapping("/readmulistband/{band}")
	public List<Musician> readbyBand(@PathVariable String band) {
		return this.musicianservice.getMusicianByBand(band);
	}
	
//	@GetMapping("/test")
//	public String test(){
//		return "Hello there!";
//	}	

}
