# Practice
This repository is used to practice and apply concepts learned during my training program. It contains small tasks, exercises, and code snippets that reflect the topics covered in the sessions. The goal is to reinforce learning through hands-on coding and experimentation.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# 1 . (RetailEcom) E-commerce Microservices Project | Spring Boot & Kafka

This repository contains a sample e-commerce application built using Spring Boot, Apache Kafka, and Maven. It demonstrates a basic order management system implemented with a microservices architecture.
                             **** __Microservices Overview__ **** 
📦 Inventory Service

Handles order creation via REST API

Publishes order details to a Kafka topic

📬 Order Service

Listens to the Kafka topic for new orders

Displays received orders via a REST API

                                    **** __Technologies Used__ *****

Java 21 - Spring Boot 3.3.3 - Apache Kafka - Maven - REST APIs

# Getting Started:

To run the project locally:

1.Start your Kafka broker

2.Run both services:

      InventoryApplication

      OrderDApplication

3.Use the following endpoints:

POST /orders/create – Place a new order
GET /api/orders/received – View received orders


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
