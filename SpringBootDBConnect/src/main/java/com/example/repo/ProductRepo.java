package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
	@Query(value = "select * from product where brand = ?1", nativeQuery = true)
	List<Product> findProductByBrand(String brand);

	//irrespective of which database you use the Query will work
	@Query("SELECT p from Product p WHERE p.name = ?1")
	List<Product> findProductByName(String name);
}
