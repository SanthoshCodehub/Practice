package com.cons.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cons.orderD;

@RestController
@RequestMapping("/api/orders")
public class OrderConsumerController {
	private final orderD OrderD;
	
	public OrderConsumerController (orderD OrderD) {
		this.OrderD = OrderD;
		
	}
	  @GetMapping("/received")
	    public List<String> getReceivedOrders() {
	        List<String> orders = OrderD.getMessages();
	        System.out.println("Returning orders: " + orders);
	        return orders;
	
	  }
	  
}
