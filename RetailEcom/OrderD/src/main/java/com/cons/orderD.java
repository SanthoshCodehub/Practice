package com.cons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class orderD {
	 private final List<String> messages = new ArrayList<>();
	 
	 @KafkaListener(topics = "invent-orders", groupId = "orderD-group")

	    public void listen(String message) {
	        messages.add(message);
	        System.out.println("Received from invent: " + message);
	    }
	 

	    public List<String> getMessages() {
	        return messages;
	    }
	 
	 
	 

}
