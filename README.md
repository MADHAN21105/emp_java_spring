# 🚀 Employee Salary Processor API

💼 A futuristic **Spring Boot REST API** built to handle employee salary operations with ease — featuring CRUD endpoints, business logic, and analytics, all crafted during a **Java Microservices Developer Internship** experience.


---

## 🧠 Features
✅ Add, view, update, and delete employees  
✅ Calculate **average salary per department**  
✅ Find the **highest-paid employee**  
✅ List employees earning **above average salary**

---

## ⚙️ Technologies Used
- Java 17+
- Spring Boot (Web)
- REST API
- In-memory `List` (no database)
- IntelliJ IDEA
- Maven

---

## ▶️ How to Run the Project

1. Clone the repository:
 ```bash
    git clone https://github.com/<your-username>/emp_java_spring.git
   cd emp_java_spring
  ```
2.Run using Maven Wrapper:
 ```bash
 ./mvnw spring-boot:run
 ```
3.The application will start on:
 ```bash
http://localhost:8082/
 ```
# 🧩 Employee Salary Processor API

This project is a **Spring Boot REST API** built to manage employee details and perform salary-related operations.  
It includes endpoints for creating, reading, updating, deleting employees, and calculating salary insights.

---

## 🚀 API Endpoints

| Method | Endpoint | Description |
|---------|-----------|-------------|
| **POST** | `/employee` | Add a new employee |
| **GET** | `/employee/{id}` | Get employee by ID |
| **GET** | `/employee/all` | Get all employees |
| **DELETE** | `/employee/{id}` | Delete employee by ID |
| **PUT** | `/employee/update-salary?id=1&salary=50000` | Update employee salary |
| **GET** | `/employee/average-salary` | Get average salary per department |
| **GET** | `/employee/highest-salary` | Get highest paid employee |
| **GET** | `/employee/above-average` | Get employees above average salary |

---

## ⚙️ How to Run the Application

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/emp_java_spring.git
   cd emp_java_spring
    ```
2. Run the project:
 ```bash
./mvnw spring-boot:run
 ```
3. Open in browser or Postman:
  ```bash
http://localhost:8082/
 ```
# 📦 Project Structure — Employee Salary Processor API

This project is a **Spring Boot REST API** built for managing employee details and salary processing operations.

Below is the overall **project directory structure** to help understand how the files are organized.

---

## 📁 Project Structure
 ```bash
src/
 ├── main/
 │   ├── java/com/example/emp_java_spring/
 │   │   ├── Employee.java
 │   │   ├── EmployeeController.java
 │   │   ├── EmployeeService.java
 │   │   └── EmpJavaSpringApplication.java
 │   └── resources/
 │       └── application.properties
 └── pom.xml
 ```
# 👨‍💻 Author

**Madhan**  
📍 *KGiSL Institute of Technology*  
📧 [Email.com](mailto:madhantech2@gmail.com)  
💼 [LinkedIn Profile](https://www.linkedin.com/in/madhan-s11072005/)

---

⭐ *Thank you for visiting this repository! Feel free to fork, star ⭐, or contribute.*





   


