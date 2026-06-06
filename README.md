# task_management_java_springboot_project


# AI-Powered Task Management Portal

## Overview

AI-Powered Task Management Portal is a full-stack web application that allows users to register, authenticate, create tasks, manage task status, and leverage AI-powered task assistance. The application is built using Spring Boot, React, MySQL, JWT Authentication, and AI integration.

---

## Features

### Authentication Module

* User Registration
* User Login
* JWT Token Generation
* Protected APIs
* Secure Password Encryption using BCrypt

### Task Management Module

Users can:

* Create Tasks
* View Tasks
* Update Tasks
* Delete Tasks
* Track Task Status

Supported Status Types:

* TODO
* IN_PROGRESS
* DONE

Task Fields:

* Title
* Description
* Priority
* Due Date
* Status
* Created Timestamp

### AI Automation Module

AI-assisted task creation feature:

* Generate task descriptions from task titles
* Suggest task priorities
* Provide estimated completion effort

Example:

Input:

Prepare Client Presentation

Output:

* Description: Prepare presentation slides and supporting materials for the client meeting.
* Priority: HIGH
* Estimated Time: 4 Hours

---

## Technology Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* JWT Authentication
* Maven

### Frontend

* React.js
* Vite
* Tailwind CSS
* React Router DOM
* Axios

### Database

* MySQL

### AI Integration

* Gemini API

---

## Project Architecture

Backend follows a layered architecture:

Controller Layer

* Handles API requests and responses

Service Layer

* Contains business logic

Repository Layer

* Handles database operations

Security Layer

* JWT Authentication
* User Authentication
* Authorization

Database Layer

* MySQL Database

---

## Project Structure

Backend

com.task.demo

* config
* controller
* dto
* entity
* exception
* repository
* security
* service

Frontend

src

* api
* components
* context
* pages

---

## Database Schema

### User Table

| Field    | Type    |
| -------- | ------- |
| id       | BIGINT  |
| name     | VARCHAR |
| email    | VARCHAR |
| password | VARCHAR |

### Task Table

| Field       | Type     |
| ----------- | -------- |
| id          | BIGINT   |
| title       | VARCHAR  |
| description | TEXT     |
| priority    | VARCHAR  |
| due_date    | DATE     |
| status      | VARCHAR  |
| created_at  | DATETIME |
| user_id     | BIGINT   |

---

## API Endpoints

### Authentication

POST /api/auth/register

Register a new user.

POST /api/auth/login

Authenticate user and generate JWT token.

---

### Tasks

POST /api/tasks

Create a task.

GET /api/tasks

Retrieve all tasks for the logged-in user.

PUT /api/tasks/{id}

Update an existing task.

DELETE /api/tasks/{id}

Delete a task.

---

### AI

POST /api/ai/generate

Generate AI-powered task description.

---

## Security Features

* JWT Authentication
* Password Encryption using BCrypt
* Protected REST APIs
* CORS Configuration
* Input Validation

---

## Setup Instructions

### Backend

1. Clone Repository

git clone <repository-url>

2. Configure MySQL Database

Create Database:

CREATE DATABASE task_manager;

3. Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/task_manager

spring.datasource.username=root

spring.datasource.password=your_password

jwt.secret=your_secret_key

4. Run Spring Boot Application

mvn spring-boot:run

Backend will start on:

http://localhost:8080

---

### Frontend

1. Navigate to frontend folder

cd taskmanagement-frontend

2. Install dependencies

npm install

3. Run application

npm run dev

Frontend will start on:

http://localhost:5173

---

## Future Enhancements

* Task Search and Filtering
* Pagination
* Role-Based Access Control
* Docker Deployment
* Swagger Documentation
* Email Notifications
* Advanced AI Recommendations

---

## Challenges Faced

* Implementing JWT Authentication
* Managing Protected Routes
* Integrating AI Services
* Designing Responsive User Interfaces
* Handling Secure API Communication

---

## Conclusion

The AI-Powered Task Management Portal successfully demonstrates full-stack development skills using Java, Spring Boot, React, MySQL, JWT Authentication, and AI integration. The application provides secure task management capabilities while leveraging AI to improve productivity and user experience.
