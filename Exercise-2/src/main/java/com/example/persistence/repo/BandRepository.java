package com.example.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Band;



@Repository
public interface BandRepository extends JpaRepository<Band,Long>{

//	@Query(value = "select * from product where brand = ?1", nativeQuery = true)
//	List<Band> findBandByBrand(String band);

	
	@Query("SELECT bd from Band bd WHERE bd.name = ?1")
	List<Band> findBandByName(String name);
	
	@Query("SELECT bd from Band bd WHERE bd.phone = ?1")
	List<Band> findBandByPhone(long phone);
	
	@Query("SELECT bd from Band bd WHERE bd.musicians = ?1")
	List<Band> findBandByMusician(String musicians);
}
