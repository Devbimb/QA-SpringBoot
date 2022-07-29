package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.exception.BandNotFoundException;
import com.example.persistence.domain.Band;
import com.example.persistence.repo.BandRepository;
import com.example.rest.dto.BandDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
public class BandService {
	private BandRepository repo;
	private ModelMapper mapper;
//	private List<Band> band = new ArrayList<>();

	public BandService(BandRepository repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private BandDTO mapToDTO(Band band) {
        return this.mapper.map(band, BandDTO.class);
        
    }
//	
//	public Band addBand(Band bd1) {
//		return this.repo.save(bd1);
//	}
	
    public BandDTO createBand(Band band) {
    	Band saved =  this.repo.save(band);
        return this.mapToDTO(saved);
        
    }
	
//	public List<Band> readBand() {
//		return this.repo.findAll();
//	}
    public List<BandDTO> readBand() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
	
	public BandDTO updateBand(long id, Band bd2) {
		Band temp = this.repo.findById(id).orElseThrow(BandNotFoundException::new);
		Optional<Band> myTempBand = Optional.of(temp);
		Band existing = myTempBand.get();
		// existing.setId(bd2.getId()); //from request body //don't do it primary key
		existing.setName(bd2.getName()); // from request body
		existing.setPhone(bd2.getPhone()); // from request body
		existing.setMusician(bd2.getMusician()); // from request body
//		return this.repo.save(existing);
		Band updated =  this.repo.save(existing);
		return this.mapToDTO(updated);		
		
	}

    
//    public BandDTO updatePerson(Long id, Band bd2) {
//        Optional<Band> existingOptional = this.repo.findById(id);
//        Band existing = existingOptional.get();
//
//        existing.setPhone(bd2.getPhone());
//        existing.setName(bd2.getName());
//        existing.setMusician(bd2.getMusician());
//
//        Band updated =  this.repo.save(existing);
//        return this.mapToDTO(updated);
//    }

 	public BandDTO readById(Long id) {
	       Band found = this.repo.findById(id).orElseThrow(BandNotFoundException::new);
	       return this.mapToDTO(found);
	    }
		
	public boolean deleteBand(Long id) {
	       this.repo.deleteById(id); // delete without info
	       boolean exists = this.repo.existsById(id);
	       return !exists;
	}

	public List<Band> getBandbyPhone(Long phone) {
		return this.repo.findBandByPhone(phone);
	}

	public List<Band> getBandbyName(String name) {
		return this.repo.findBandByName(name);
	}

	public List<Band> getBandbyMusician(String musicians) {
		return this.repo.findBandByMusician(musicians);
	}	
}
