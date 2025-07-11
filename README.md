# 🧾 Ticket Tracker Web Application

A secure, full-featured Ticket Tracking System built with **Spring Boot** for efficient issue management and role-based user interaction. This web application facilitates the creation, tracking, and resolution of support tickets by both administrators and users in a streamlined interface.

---

## 🔍 Project Overview

The Ticket Tracker application allows users to:
- Register, log in, and manage sessions securely.
- Create, update, and delete tickets.
- Add comments on tickets.
- View and manage tickets by priority, status, and date.
- Use role-based access for admin and regular users.

This project is ideal for internal IT support teams, educational institutions, or small organizations needing a simple helpdesk solution.

---

## ⚙️ Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Thymeleaf** (for frontend templates)
- **Hibernate / JPA**
- **MySQL** (for database)
- **Maven** (for build automation)
- **HTML5, CSS3, Bootstrap** (for frontend UI)

---

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/spring-boot-ticket-tracker-web-app.git
cd spring-boot-ticket-tracker-web-app/spring-ticket-tracker
```

### 2. Set Up the Database
- Create a MySQL database (e.g., `ticketdb`).
- Import the SQL files provided:
  - `Credentials.sql`
  - `Ticket_Dummy_data.sql`
  - `ticketApplication.sql`

### 3. Configure Application Properties
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ticketdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the Application
You can run the application using:
```bash
./mvnw spring-boot:run
```
or from your IDE (e.g., IntelliJ, Eclipse).

---

## 🔐 Features

- ✅ User Registration & Authentication
- ✅ Admin/User Role Management
- ✅ Ticket Submission & Comments
- ✅ Filter by Status, Priority, and Dates
- ✅ Responsive UI with Thymeleaf Templates
- ✅ Secure Password Handling with BCrypt

---

## 📁 Project Structure

```
spring-ticket-tracker/
├── src/main/java/com/esd/ticketTracker
│   ├── controller/
│   ├── dto/
│   ├── entity/
│   ├── repository/
│   ├── service/
│   └── config/
├── resources/
│   ├── templates/
│   └── application.properties
```

---

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---
