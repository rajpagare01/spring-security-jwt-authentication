# 🔐 Spring Boot JWT Authentication

This project demonstrates a secure authentication and authorization system using **Spring Boot**, **Spring Security**, and **JWT (JSON Web Tokens)**.

It includes user authentication, role-based access control, protected REST endpoints, and token validation — all without using an external frontend.

---

## 🚀 Features

- 🔑 User Registration & Login
- 🔐 JWT Token Generation & Validation
- 🚧 Secure API Endpoints (Public + Private)
- 👤 Role-Based Authorization
- 🧪 Tested using Postman (can be integrated with frontend later)
- ⚙ Custom UserDetailsService & Authentication Filter

---

## 🛠 Technologies Used

| Component | Tech |
|----------|------|
| Language | Java 17+ |
| Framework | Spring Boot 3.x |
| Security | Spring Security |
| Token | JWT (JSON Web Token) |
| Build Tool | Maven |

---

## 📦 Project Structure
src/main/java/com/learnSpring/securityex
├── config
│ └── SecurityConfig.java
│ └── JwtFilter.java
├── controller
│ └── UserController.java
│ └── StudentController.java
│ └── HelloController.java
├── model
│ └── User.java
│ └── Student.java
├── repo
│ └── UserRepo.java
├── service
│ └── MyUserDetailsService.java
│ └── JWTService.java
│ └── UserService.java

---

## ▶️ How to Run the Project

### **Prerequisites**
- Java 17+
- Maven
- (Optional) MySQL / H2 Database

---

### **Steps**

1. Clone the repository:

```bash
git clone https://github.com/rajpagare01/spring-security-jwt-authentication.git

Navigate to the folder:

cd spring-security-jwt-authentication


Run the project:

mvn spring-boot:run

🔥 API Endpoints
Method	Endpoint	Description	Auth Required
POST	/register	Register new user	❌ No
POST	/login	Login and get JWT token	❌ No
GET	/hello	Public Endpoint	❌ No
GET	/students	Protected Resource	✔ Yes (JWT)
🧪 Testing With Postman

Register a user.

Login using credentials and copy the JWT token returned.

Add token in Authorization Header:

Authorization: Bearer <your_token_here>


Access protected endpoints.

🔮 Future Improvements

🌍 Add OAuth2 (Google Login)

🎨 Add React/Angular UI

📌 Add Refresh Token Support

🗄 Switch to persistent DB (MySQL/Postgres)

📘 License
This project is open-source and free to use under the MIT License.
Thank you


⭐ If you found this useful, give the repo a star!
