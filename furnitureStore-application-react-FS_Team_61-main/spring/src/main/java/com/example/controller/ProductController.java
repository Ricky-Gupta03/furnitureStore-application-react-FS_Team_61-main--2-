package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ProductModel;
import com.example.repository.ProductRepository;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/admin")
	public List<ProductModel> getProduct(){
		//This method helps the admin to fetch all products from the database
		return null;
	}
	
	@GetMapping("/home")
	public List<ProductModel> getHomeProduct(){
		// This method helps to retrieve all the products from the database
		List<ProductModel> list = productRepository.findAll();
		return list;
	}
	
	@GetMapping("/admin/productEdit/{id}")
	public ProductModel productEditData(String id){ 
		// This method helps to retrieve a product from the database based on the productid
		return null;
	}
	
	@PostMapping("/admin/productEdit/{id}")
	public String productEditSave(ProductModel data) {
		// This method helps to edit a product and save it to the database
		return "Save the Changes";
	}
	 
	@PostMapping("/admin/addProduct")
	public String productSave(@RequestBody ProductModel data){ 
		// This method helps to add a new product to the database
		productRepository.save(data);
		return "Product added";
	}
	
	@PostMapping("/admin/delete/{id}")
	public String productDelete(String id){
		// This method helps to delete a product from the database
		return "Product deleted";
	}
	 
}
