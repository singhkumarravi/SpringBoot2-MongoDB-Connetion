package com.olive.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olive.model.Product;

public interface ProductRepo extends MongoRepository<Product, Integer> {

}
