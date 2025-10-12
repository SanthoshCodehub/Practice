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


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# 2.🧾 Employee & Order Microservices Project

This project demonstrates two Spring Boot microservices: **EmpOrderService** and **EmpEmployeeService**.  
The Employee service communicates with the Order service using **REST API calls**, with **Swagger UI** enabled for easy API testing.

---

##  Project Structure

### 🔹 1. EmpOrderService
- **Port:** `8081`
- **Purpose:** Provides mocked order data.
- **Main Components:**
  - `EmpOrderServiceApplication.java`
  - `OrderController.java`
  - `Order.java` (model)
- **Endpoints:**
  | Method | Endpoint | Description |
  |--------|----------|-------------|
  | GET | `/order/{id}` | Returns order details by ID |

- **Swagger URL:** [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)
- (http://localhost:8082/swagger-ui/index.html#/employee-controller/getOrderInfo)
---

### 🔹 2. EmpEmployeeService
- **Port:** `8082`
- **Purpose:** Consumes the Order service and returns enhanced responses.
- **Main Components:**
  - `EmpEmployeeServiceApplication.java`
  - `EmployeeController.java`
- **Endpoints:**
  | Method | Endpoint | Description |
  |--------|----------|-------------|
  | GET | `/employee/getOrder/{id}` | Fetches order from Order service |
  | GET | `/employee/info` | Returns a simple status message |

- **Swagger URL:** [http://localhost:8083/swagger-ui/index.html](http://localhost:8083/swagger-ui/index.html)
---
## ⚙️ How to Run
1. **Start EmpOrderService**  
   Run `EmpOrderServiceApplication` (port 8081)

2. **Start EmpEmployeeService**  
   Run `EmpEmployeeServiceApplication` (port 8082)

> ✅ Ensure **Order service is running first**, so Employee service can consume its APIs.
--
## 🧪 Sample API Call

**GET** `http://localhost:8081/order/101`

**Response:**
```json
{
  "id": 101,
  "name": "Mobile",
  "price": 50000.0
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
