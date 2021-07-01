package com.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.model.ProductPojo;
import com.service.ProductService;

//mark class as Controller
@RestController
public class ProductController {
//autowire the BooksService class
	@Autowired
	ProductService productService;

	@GetMapping("/product/{SKUid}")
	private Product getProduct(@PathVariable("SKUid") Long SKUid) {
		return productService.getProductBySKUId(SKUid);
	}

	@PostMapping(value = "/products", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })

	// private Long saveProduct(@Valid @RequestBody Product products) {
	private ResponseEntity<ProductPojo> saveProduct(@Valid @RequestBody Product products) {
		/*
		 * if (result.hasErrors()) { System.out.println("Error has occoured"); }
		 */
		/*
		 * ModelMapper modelMapper = new ModelMapper();
		 * modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
		 * ; Product products2 = modelMapper.map(products, Product.class);
		 * System.out.println(products2);
		 */
		Product saveProduct= productService.save(products);
		 ModelMapper modelMapper = new ModelMapper();
		ProductPojo pojo = modelMapper.map(saveProduct,
				ProductPojo.class);
		
		return  new ResponseEntity(pojo, HttpStatus.CREATED);
	}

}
