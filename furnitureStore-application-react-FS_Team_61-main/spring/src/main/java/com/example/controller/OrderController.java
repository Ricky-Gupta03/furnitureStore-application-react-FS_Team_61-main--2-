package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.OrderModel;

@RestController
@RequestMapping("/")
public class OrderController {

	@PostMapping("/orders")
	public List<OrderModel> getUserProducts(String id){ //OrderTemp
		// This method helps to list the orders based on the user id
		return null;
	}
	
	@PostMapping("/saveOrder")
	public String saveProduct(String id){ 
		// This method helps to save the cart items as an order
		return "Cart items added to the Orders list";
	}
	
	@PostMapping("/placeOrder")
	public String placeOrder(OrderModel order){
		// This method helps to place an order by the customer
		return "Place items to orders directly";
	}
	
	@GetMapping("/admin/orders")
	public List<OrderModel> getAllOrders(){ // Added Extra
		// This method helps to list all the orders
		return null;
	}
	
}
