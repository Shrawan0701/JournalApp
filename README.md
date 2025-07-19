# 📓 Journal App – Personal Journal API

##  Architecture

Journal App follows a backend-only RESTful architecture built with **Spring Boot** and **MongoDB**.

- The app is designed as a secure and scalable **REST API**, enabling clients (like frontend apps or mobile apps) to manage journal entries.
- It includes features like **user authentication**, **CRUD operations** for journal entries, and **JWT-based authorization**.
- Built with a clean separation of concerns between controllers, services, and repository layers for maintainability.


---

##  Features

-  **User Authentication**
  - Register and log in with secure password hashing (BCrypt)
  - JWT-based session management for stateless security
-  **Journal Entry Management**
  - Create, Read, Update, and Delete personal journal entries
  - Each journal entry is linked to an authenticated user
-  **Secure REST API**
  - All journal actions require JWT authentication

---

##  Tech Stack

- **Java ** – Core programming language
- **Spring Boot** – Backend framework
- **Spring Security** – Authentication & authorization
- **Spring Data MongoDB** – ORM layer for MongoDB
- **JWT** – Secure token handling
- **Maven** – Project & dependency management

### Database
- **MongoDB Atlas** – NoSQL cloud-hosted document database

---


##  API Endpoints

| Method | Endpoint                   | Description                     | Auth Required |
|--------|----------------------------|----------------------------------|---------------|
| POST   | `/api/v1.0/auth/register`  | Register a new user              | ❌            |
| POST   | `/api/v1.0/auth/login`     | Login and receive JWT token      | ❌            |
| POST   | `/api/v1.0/journal`        | Create new journal entry         | ✅            |
| GET    | `/api/v1.0/journal`        | Get all user journal entries     | ✅            |
| PUT    | `/api/v1.0/journal/{id}`   | Update a specific journal entry  | ✅            |
| DELETE | `/api/v1.0/journal/{id}`   | Delete a specific journal entry  | ✅            |

---

##  Contact

Feel free to connect or reach out if you have questions or feedback!

- 📧 Email: [shrawanrw07@gmail.com](mailto:shrawanrw07@gmail.com)  
- 💼 LinkedIn: [linkedin.com/in/shrawanwandhekar](https://linkedin.com/in/shrawanwandhekar)

---



