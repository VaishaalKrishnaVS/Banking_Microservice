# Banking Application Backend

This repository contains the backend code for a robust **Banking Application**, designed using **microservices architecture** and modern **Java** technologies. The project focuses on building a scalable, resilient, and secure solution for core banking functions, ensuring high performance and reliability.

## Architecture Overview

The backend is structured around a **microservices architecture**, allowing the application to be broken down into modular, independently deployable services. Each service manages a distinct business capability, ensuring ease of maintenance, scalability, and fault tolerance.

### Key Features:
- **Microservices Architecture**: Decoupled and independently deployable services.
- **Event-Driven Architecture**: Using **Apache Kafka** for asynchronous communication.
- **Resilience Patterns**: Implemented fault-tolerant systems with **Resilience4j**.
- **Observability**: Real-time monitoring with **Prometheus**, **Grafana**, and **Loki**.
- **Security**: Secured using **OAuth2**, **OpenID Connect**, and **Spring Security**.

## Technology Stack

- **Java**
- **Spring Boot**
- **Spring Cloud** (Config Server, Eureka)
- **Spring Security** (OAuth2, OpenID Connect)
- **Resilience4j** (Circuit Breaker, Rate Limiter, Time Limiter)
- **Apache Kafka**
- **Kubernetes** (Elastic Kubernetes Service - EKS)
- **Helm** (for container orchestration)
- **Prometheus, Grafana, Loki, Promtail, Tempo** (for monitoring and observability)
- **Swagger** (API documentation using Open API Specification)

## Microservices Overview

1. **Account Service**: Manages user accounts, account creation, and authentication.
2. **Transaction Service**: Handles transactions between accounts and external services.
3. **Loan Service**: Processes loan applications and manages loan repayments.
4. **Notification Service**: Sends notifications via email/SMS to customers.
5. **Audit Service**: Logs all activities within the application for compliance and auditing.

## Configuration Management

Configuration is managed centrally using **Spring Cloud Config Server**, ensuring all microservices retrieve their configurations dynamically and in a consistent manner.

### Setup:
- **Spring Cloud Config Server** is used for centralized configuration management.
- Configurations are stored in a **Git** repository for version control and change tracking.

## Service Discovery and Load Balancing

The system uses **Spring Eureka Server** for **service discovery** and **load balancing** to facilitate seamless communication between microservices.

## Resilience Patterns

We have implemented the following resilience patterns to improve the stability and fault tolerance of the system:
- **Circuit Breaker**, **Rate Limiter**, and **Time Limiter** using the **Resilience4j** framework.

## Observability and Monitoring

We have integrated **Prometheus** for metrics collection, **Loki** for logging, and **Grafana** for visualization, ensuring full observability of the microservices:
- **Prometheus**: Collects application metrics.
- **Loki**: Aggregates logs from the microservices.
- **Promtail**: For log shipping to **Loki**.
- **Tempo**: Traces requests for distributed tracing.

## Security

We use **OAuth2**, **OpenID Connect**, and **Spring Security** to ensure secure authentication and authorization across the microservices, protecting sensitive data and ensuring compliance with security best practices.

## Event-Driven Architecture

The application adopts an **event-driven** approach for communication between services using **Apache Kafka**. This ensures loose coupling and scalability for asynchronous message processing.

## Container Orchestration

The microservices are containerized and orchestrated using **Kubernetes** with **Elastic Kubernetes Service (EKS)** and **Helm** charts for easy deployment and scaling.

## API Documentation

The API documentation is available via **Swagger** with the **Open API Specification**:
- API documentation can be accessed at `http://{service-url}/swagger-ui.html`.

## Running the Application

### Prerequisites

- **Docker**
- **Kubernetes Cluster** (EKS or any other provider)
- **Helm**
- **Java 11+**
- **Kafka**

### Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/banking-application-backend.git
   cd banking-application-backend
