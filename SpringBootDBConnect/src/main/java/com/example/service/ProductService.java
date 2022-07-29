package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.repo.ProductRepo;

@Service
public class ProductService {
	private ProductRepo repo;

	// public List<Product> list=new ArrayList();//list is empty
	public ProductService(ProductRepo repo) {
		super();
		this.repo = repo;

	}

	public Product addProduct(Product p1) {
		return this.repo.save(p1);
//		this.list.add(p1);
//		return this.list.get(list.size()-1);
	}

	public List<Product> readProduct() {
		return this.repo.findAll();
//		return this.list;
	}

//	public Product updateProduct(int id, Product p2) {
//		Optional<Product> myTempProduct = this.repo.findById(id);
//		Product existing = myTempProduct.get();
//		// existing.setId(p2.getId()); //from request body //don't do it primary key
//		existing.setName(p2.getName()); // from request body
//		existing.setBrand(p2.getBrand()); // from request body
//		return this.repo.save(existing);
	//(a,b)->{sysout(a+b}
	public Product updateProduct(int id, Product p2) {
		Product temp = this.repo.findById(id).orElseThrow(ProductNotFoundException::new);
		Optional<Product> myTempProduct = Optional.of(temp);
		Product existing = myTempProduct.get();
		// existing.setId(p2.getId()); //from request body //don't do it primary key
		existing.setName(p2.getName()); // from request body
		existing.setBrand(p2.getBrand()); // from request body
		return this.repo.save(existing);		
		
		
//		this.list.remove(id);//remove p2 with that id=3
//		this.list.add(id,p2);//added a new product at 3rd position
//		return this.list.get(id);//reading the product at 3rd position
	}

	public boolean deleteProduct(int id) {
		this.repo.deleteById(id); // delete without info
		boolean exists = this.repo.existsById(id);
		return !exists;

////		public void deleteProduct(int id) {	
////		this.list.remove(id);
////		}
//	public List<Product> getProductbyBrand(String brand){ 
//		return this.repo.findProductByBrand(brand);
//	}
//	public List<Product> getProductbyName(String name){ 
//		return this.repo.findProductByName(name);
//	}

	}

	public List<Product> getProductbyBrand(String brand) {
		return this.repo.findProductByBrand(brand);
	}

	public List<Product> getProductbyName(String name) {
		return this.repo.findProductByName(name);
	}
}
