package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.exception.MusicianNotFoundException;
import com.example.persistence.domain.Musician;
import com.example.persistence.repo.MusicianRepository;
import com.example.rest.dto.MusicianDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
public class MusicianService {
	private MusicianRepository repo;
	private ModelMapper mapper;
//	private List<Band> band = new ArrayList<>();

	public MusicianService(MusicianRepository repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private MusicianDTO mapToDTO(Musician musician) {
        return this.mapper.map(musician, MusicianDTO.class);
        
    }
//	
//	public Musician addMusician(Band mu1) {
//		return this.repo.save(mu1);
//	}
	
    public MusicianDTO addMusician(Musician musician) {
    	Musician saved =  this.repo.save(musician);
        return this.mapToDTO(saved);
        
    }
	
//	public List<Musician> readMusician() {
//		return this.repo.findAll();
//	}
    public List<MusicianDTO> readMusician() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
	
	public MusicianDTO updateMusician(long id, Musician mu2) {
		Musician temp = this.repo.findById(id).orElseThrow(MusicianNotFoundException::new);
		Optional<Musician> myTempBand = Optional.of(temp);
		Musician existing = myTempBand.get();
		// existing.setId(bd2.getId()); //from request body //don't do it primary key
		existing.setName(mu2.getName()); // from request body
		existing.setStrings(mu2.getStrings()); // from request body
		existing.setType(mu2.getType()); // from request body
		existing.setBand(mu2.getBand()); // from request body
//		return this.repo.save(existing);
		Musician updated =  this.repo.save(existing);
		return this.mapToDTO(updated);		
		
	}

    
//    public MusicianDTO updatePerson(Long id, Musician mu2) {
//        Optional<Musician> existingOptional = this.repo.findById(id);
//        Band existing = existingOptional.get();
//
//        existing.setType(mu2.getType());
//        existing.setName(mu2.getName());
//        existing.setStrings(mu2.getStrings());
//
//        Musician updated =  this.repo.save(existing);
//        return this.mapToDTO(updated);
//    }

 	public MusicianDTO readById(Long id) {
 		   Musician found = this.repo.findById(id).orElseThrow(MusicianNotFoundException::new);
	       return this.mapToDTO(found);
	    }
		
	public boolean deleteMusician(Long id) {
	       this.repo.deleteById(id); // delete without info
	       boolean exists = this.repo.existsById(id);
	       return !exists;
	}

	public List<Musician> getMusicianByType(String type) {
		return this.repo.findMusicianByType(type);
	}

	public List<Musician> getMusicianByName(String name) {
		return this.repo.findMusicianByName(name);
	}

	public List<Musician> getMusicianByStrings(Long strings) {
		return this.repo.findMusicianByStrings(strings);
	}	
	public List<Musician> getMusicianByBand(String band) {
		return this.repo.findMusicianByBand(band);
	}	
}
