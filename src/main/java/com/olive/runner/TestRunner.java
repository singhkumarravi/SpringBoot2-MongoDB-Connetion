package com.olive.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Product;
import com.olive.repo.ProductRepo;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {
		System.out.println("Runner Class Started............");
       repo.save(new Product(101, "Pen", 300.0, "Staionary"));  
       repo.save(new Product(102, "BOOK", 600.0, "Staionary"));  
       repo.save(new Product(103, "PENSIL", 500.0, "Staionary"));  
       repo.save(new Product(104, "COPY", 800.0, "Staionary")); 
       System.out.println("Product Data Save into MongoDB");
	}

}
