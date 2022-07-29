package com.example.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Musician;

	@Repository
	public interface MusicianRepository extends JpaRepository<Musician,Long>{

//		@Query(value = "select * from product where brand = ?1", nativeQuery = true)
//		List<Band> findBandByBrand(String band);

		
		@Query("SELECT mu from Musician mu WHERE mu.name = ?1")
		List<Musician> findMusicianByName(String name);	
		
		@Query("SELECT mu from Musician mu WHERE mu.strings = ?1")
		List<Musician> findMusicianByStrings(Long strings);	
		
		@Query("SELECT mu from Musician mu WHERE mu.type = ?1")
		List<Musician> findMusicianByType(String type);	
		
		@Query("SELECT mu from Musician mu WHERE mu.band = ?1")
		List<Musician> findMusicianByBand(String band);
}
