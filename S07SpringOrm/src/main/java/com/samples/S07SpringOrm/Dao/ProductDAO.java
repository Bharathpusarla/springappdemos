package com.samples.S07SpringOrm.Dao;

import java.util.List;

import com.samples.S07SpringOrm.entity.Product;

public interface ProductDAO {

	int create(Product product);
   
	void update(Product product);
	
	void delete(Product product);
	
    Product find(int id);
	
	List<Product> findAll();
	
}