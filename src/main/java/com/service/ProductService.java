package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public Product getProductBySKUId(Long SKUid) {
		return productRepository.findById(SKUid).get();
	}

	public Product save(Product products) {
		System.out.println(products);
	return	productRepository.save(products);
		
	}
}