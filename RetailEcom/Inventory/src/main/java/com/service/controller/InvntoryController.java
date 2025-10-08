package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class InvntoryController {
	
	@Autowired
	private KafkaTemplate<String ,String > kafkaTemplate;
	
	
	@Value("${topic.invent}")
	private String inventTopic;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody String orderDetails) {
		kafkaTemplate.send(inventTopic,orderDetails);
		return "Order placed successfully and sent to ORDER!";
		
	}
	

	

}
