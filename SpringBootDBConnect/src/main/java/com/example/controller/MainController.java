package com.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Product;
import com.example.service.ProductService;

@RestController
public class MainController {
	private ProductService service;
	
	public MainController(ProductService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public Product create(@RequestBody Product p1) {
		return this.service.addProduct(p1);
	}
		
	@GetMapping("/read")
	public List<Product> read(){
		return this.service.readProduct();
	}

	@PutMapping("/update/{id}")
	public Product update(@PathVariable int id,@RequestBody Product p2){
		return this.service.updateProduct(id, p2);
	}
		
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable int id) {
	this.service.deleteProduct(id);
	}
	
//	@GetMapping("/read/{brand}")
//	public List<Product> read(@PathVariable String brand) {
//		return this.service.getProductbyBrand(brand);
//	}
//
//	@GetMapping("/read/{name}")
//	public List<Product> readbyName(@PathVariable String name) {
//		return this.service.getProductbyName(name);
//	}
		
	@GetMapping("/read/{brand}")
	public List<Product> read (@PathVariable String brand) {
		return this.service.getProductbyBrand(brand);
	}
	
	@GetMapping("/read/{name}")
	public List<Product> readbyName(@PathVariable String name) {
		return this.service.getProductbyName(name);
	}
	
	@GetMapping("/test")
	public String test(){
		return "Hello there!";
	}

}
