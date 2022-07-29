package com.example.accountrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.accountmodel.CustomerAct;


	@Repository
	public interface CustomerActRepo extends JpaRepository<CustomerAct,Integer>{
		@Query(value = "select * from customeract where actno = ?1", nativeQuery = true)
		List<CustomerAct> findCustomerActByActNo(int actno);

		//irrespective of which database you use the Query will work
		@Query("SELECT p from CustomerAct p WHERE p.name = ?1")
		List<CustomerAct> findCustomerActByName(String name);

}
