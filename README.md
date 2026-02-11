# 🌐 Spring Boot Microservices Architecture

## 📌 Overview

This repository contains multiple Spring Boot microservices projects demonstrating core distributed system concepts using Spring Cloud.

The projects cover service discovery, load balancing, API Gateway, configuration management, circuit breaker patterns, and inter-service communication.

This repository reflects practical hands-on implementation of microservices architecture.

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Cloud
- Eureka Server
- Spring Cloud Config
- Spring Cloud Gateway
- OpenFeign
- Circuit Breaker (Resilience pattern)
- Maven

---

# 📂 Microservices Concepts Covered

---

## 🔹 Service Discovery (Eureka Server)

- Microservices registration
- Dynamic service lookup
- Centralized service registry

Projects:
- BootMs-Proj01-RandD-EurekaServer
- BootMs-Proj04-RandD-EurekaServer
- BootMs-Proj05-RandD-EurekaServer

---

## 🔹 Inter-Service Communication

- REST template communication
- Feign Client communication
- Service-to-service calls

Projects:
- BootMs-Proj02-PublishingMs
- BootMs-Proj03-ConsumingMs
- BootMs-Proj06-ConsumingMs-feignClient

---

## 🔹 Load Balancing

- Client-side load balancing
- Service replication handling

Projects:
- BootMs-Proj05-ConsumingMs-LoadBalanceClientComp

---

## 🔹 Configuration Server

- Centralized configuration using:
  - Git-based config server
  - Local config server
  - Refresh scope support

Projects:
- BootMs-Proj07-ConfigServer-Git
- BootMs-Proj08-ConfigServer-localDriver
- BootMs-Proj09-ConfigServer-RefreshScope

---

## 🔹 API Gateway

- Centralized routing
- Request filtering
- Unified entry point

Projects:
- BootMs-Proj13-SpringCloudAPIGateway
- MiniProject-APIGatewayServer

---

## 🔹 Circuit Breaker Pattern

- Fault tolerance implementation
- Service resilience handling

Projects:
- BootMs-Proj12-RandD-EurekaServer-CircuitBreaker

---

## 🔹 Admin & Monitoring

- Admin Server integration
- Microservices monitoring

Projects:
- BootMs-Proj11-AdminServer
- MiniProject-AdminServer

---

# 🏗 Architecture Pattern

The architecture follows distributed microservices design:

Client → API Gateway → Microservices → Service Registry → Config Server → Database

Key Principles:

- Decoupled services
- Independent deployment
- Service discovery
- Centralized configuration
- Fault tolerance

---

# 🎯 Key Learning Outcomes

- Implemented microservices using Spring Cloud
- Configured Eureka Service Registry
- Built API Gateway routing layer
- Applied Feign client for service communication
- Implemented Circuit Breaker for resilience
- Managed centralized configuration server
- Understood distributed system fundamentals

---

## 🚀 Future Enhancements

- Add Docker containerization
- Implement centralized logging
- Add distributed tracing
- Integrate OAuth2 / JWT security
- Deploy to cloud environment

---

## 👨‍💻 Author

**Ganta Lakshman Naga Durga Sairam**  
Java Full Stack Developer  
Hyderabad, India
