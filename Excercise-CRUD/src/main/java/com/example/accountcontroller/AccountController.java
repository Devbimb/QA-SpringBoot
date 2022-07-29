package com.example.accountcontroller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.accountmodel.CustomerAct;
import com.example.accountservice.CustomerActService;


@RestController
public class AccountController {
	private CustomerActService accountservice;

		public 	AccountController(CustomerActService accountservice) {
			super();
			this.accountservice = accountservice;
	}
		@PostMapping("/create")
		public CustomerAct create(@RequestBody CustomerAct c1) {
			return this.accountservice.addCustomerAct(c1);
		}
			
		@GetMapping("/read")
		public List<CustomerAct> read(){
			return this.accountservice.readCustomerAct();
		}

		@PutMapping("/update/{id}")
		public CustomerAct update(@PathVariable int id,@RequestBody CustomerAct c2){
			return this.accountservice.updateCustomerAct(id, c2);
		}
			
		@DeleteMapping("/delete/{id}")
		public void delete (@PathVariable int id) {
		this.accountservice.deleteCustomerAct(id);
		}
		
		@GetMapping("/read/{actno}")
		public List<CustomerAct> read (@PathVariable int actno) {
			return this.accountservice.getCustomerActbyActno(actno);
		}
		
		@GetMapping("/read/{name}")
		public List<CustomerAct> readbyName(@PathVariable String name) {
			return this.accountservice.getCustomerActbyName(name);
		}
			
		@GetMapping("/test")
		public String test(){
			return "Hello there!";
		}

}
