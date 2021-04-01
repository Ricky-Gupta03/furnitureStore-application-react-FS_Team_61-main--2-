package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CartModel;
import com.example.repository.CartRepository;

@RestController
@RequestMapping("/")
public class CartController {
	
	@Autowired
	private CartRepository cartRepository;

	@PostMapping("/home/{id}")
	public String addToCart(String Quantity, String id){ 
		// This method helps the customer to add the product to the cart.
		return "Item added to cart";
	}
	
	@GetMapping("/cart/{id}")
	public List<CartModel> showCart(String id){ //CartTempModel
		// This method helps to view the cart items
		List<CartModel> list = cartRepository.findAll();
		return list;
	}
	
	@PostMapping("/cart/delete")
	public String deleteCartItem(String id){ 
		// This method helps to delete a product from the cart.
		return "Cart Deleted";
	}
	
}
