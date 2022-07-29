package com.example.accountservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.accountmodel.CustomerAct;
import com.example.accountrepo.CustomerActRepo;

@Service
public class CustomerActService {
		private CustomerActRepo accountrepo;
		//public List<Product> list=new ArrayList();//list is empty
		public CustomerActService(CustomerActRepo accountrepo) {
			super();
			this.accountrepo = accountrepo;
			  
		}
		public CustomerAct addCustomerAct(CustomerAct c1) {
			return this.accountrepo.save(c1);
//			this.list.add(p1);
//			return this.list.get(list.size()-1);
		}
		public List<CustomerAct> readCustomerAct() {
			return this.accountrepo.findAll();
//			return this.list;
		}
		public CustomerAct updateCustomerAct(int id, CustomerAct c2) {
			Optional<CustomerAct>myTempCustomerAct = this.accountrepo.findById(id);
			CustomerAct existing = myTempCustomerAct.get();
			//existing.setId(p2.getId()); //from request body //don't do it primary key
			existing.setName(c2.getName()); //from request body
			existing.setActno(c2.getActno()); //from request body
			return this.accountrepo.save(existing);
			
//			this.list.remove(id);//remove p2 with that id=3
//			this.list.add(id,p2);//added a new product at 3rd position
//			return this.list.get(id);//reading the product at 3rd position
		}
		public boolean deleteCustomerAct(int id) {
			this.accountrepo.deleteById(id); //delete without info
			boolean exists = this.accountrepo.existsById(id);
			return !exists;
			
//			public void deleteProduct(int id) {	
//			this.list.remove(id);
			}
		public List<CustomerAct> getCustomerActbyActno(int actno){ 
			return this.accountrepo.findCustomerActByActNo(actno);
		}
		public List<CustomerAct> getCustomerActbyName(String name){ 
			return this.accountrepo.findCustomerActByName(name);
		}
			
}
