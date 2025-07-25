<h1 align="center">🚗 TripEase - Travel Booking Backend App</h1>

<p align="center">
  <b>Java + Spring Boot + MySQL</b><br>
  REST API project with booking, driver, customer modules & email notifications.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.7.3-brightgreen" alt="Spring Boot">
  <img src="https://img.shields.io/badge/MySQL-8.0-blue" alt="MySQL">
  <img src="https://img.shields.io/badge/Postman-Tested-orange" alt="Postman">
  <img src="https://img.shields.io/badge/Swagger-UI-green" alt="Swagger UI">
</p>

---

## 🚀 Tech Stack

| Technology     | Description                            |
|----------------|----------------------------------------|
| 🟢 Java 21      | Backend language                       |
| 🌱 Spring Boot  | Framework for building REST APIs       |
| 🐬 MySQL        | Relational database (used via DBeaver) |
| 📧 SMTP (Gmail) | For sending email notifications        |
| 📘 Swagger UI   | Interactive API documentation          |
| 📮 Postman      | API testing tool                       |
| ⚙️ Maven         | Dependency and build management        |

---

## 📌 Key Features

| Feature                      | Description                                      |
|-----------------------------|--------------------------------------------------|
| 👤 Customer Registration     | Add and view customers                           |
| 🚖 Driver & Cab Management   | Register drivers and cabs                        |
| 📦 Book Trip                 | Book a cab based on distance                     |
| ✉️ Email Notification        | Confirmation email sent using SMTP (Gmail)       |
| 🔐 Secure Config             | Sensitive data is stored in `.env` file          |
| 📃 Swagger UI                | Built-in API documentation for testing           |

---

## 🧩 Database Schema

### 📋 Tables Overview

| Table      | Description              |
|------------|--------------------------|
| `Customer` | Stores customer details  |
| `Driver`   | Driver information       |
| `Cab`      | Cab registration records |
| `Booking`  | Trip booking info        |

> Relational mapping is handled via Spring JPA annotations (`@OneToOne`, `@ManyToOne` etc.)

---

## 📂 Project Structure

tripease/
├── .mvn/                               # Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/tripease/
│   │   │       ├── controller/         # REST Controllers
│   │   │       ├── dto/                # Data Transfer Objects
│   │   │       ├── model/              # Entity classes: Customer, Driver, Booking, Cab
│   │   │       ├── repository/         # Spring Data JPA Repositories
│   │   │       ├── service/            # Business Logic
│   │   │       ├── transformer/        # Response Converters (DTO mapping)
│   │   │       └── TripeaseApplication.java  # Main class
│   │   └── resources/
│   │       ├── application.properties  # Configuration properties
│   │       ├── static/                 # Static resources (if any)
│   │       └── templates/              # Thymeleaf templates (if used)
│   └── test/                           # Unit and integration tests
├── .env                                # Sensitive environment variables
├── .gitignore
├── mvnw / mvnw.cmd                     # Maven Wrapper Scripts
├── pom.xml                             # Maven build file
└── README.md                           # Project documentation

---

## 🌐 API Endpoints

### 🔹 Customer APIs

| Method | Endpoint              | Description           |
|--------|-----------------------|-----------------------|
| POST   | `/customer/add`       | Register new customer |
| GET    | `/customer/get`       | Get all customers     |
| GET    | `/customer/gender`    | Filter by gender      |

### 🔹 Driver & Cab APIs

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| POST   | `/driver/add`      | Register driver     |
| POST   | `/cab/register`    | Register new cab    |
| GET    | `/cab/list`        | Get available cabs  |

### 🔹 Booking APIs

| Method | Endpoint                            | Description         |
|--------|-------------------------------------|---------------------|
| POST   | `/booking/book/customer/{id}`       | Book cab for user   |
| GET    | `/booking/get`                      | View all bookings   |

📌 Example Request Body (Booking):
```json
{
  "pickup": "delhi",
  "destination": "pune",
  "tripDistanceInKm": 30
}


⸻

🧪 Postman & Swagger
	•	🔹 Postman Collection: Available in postman/ folder
	•	🔹 Swagger UI:
👉 Visit: http://localhost:8080/swagger-ui.html

⸻

🔐 Environment Setup

Create a .env file in your root directory:

DB_URL=jdbc:mysql://localhost:3306/tripease-db
DB_USERNAME=your_mysql_username
DB_PASSWORD=your_mysql_password

EMAIL_USERNAME=your_email@gmail.com
EMAIL_PASSWORD=your_app_specific_password


⸻

🛠 Run Locally

git clone https://github.com/yourusername/tripease.git
cd tripease

# Create the .env file and add DB/SMTP credentials
cp .env.example .env

# Start MySQL and create DB if not exists

# Run the app
./mvnw spring-boot:run


⸻

📷 Screenshots

<details>
<summary><b>📌 Postman Booking API</b></summary>


</details>


<details>
<summary><b>🧱 IntelliJ Project Structure</b></summary>


</details>



⸻

📦 Deployment (Railway/Render)

Instructions to deploy on Railway are available in docs/DEPLOY.md.

⸻

👤 Author

Aniket Pawar
B.E. in Robotics & Automation Engineering
📬 LinkedIn
💼 Java | Spring Boot | REST | MySQL

⸻

🌟 Star this Repository!

If this project helped you, please consider giving it a ⭐ on GitHub.

---
