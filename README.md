<h1 align="center">🚖 TripEase - Spring Boot Cab Booking API</h1>

<p align="center">
A Java Spring Boot-based backend REST API that allows users to register customers, add drivers, register cabs, and book trips.
<br/>
✨ Integrated with SMTP for email confirmation, Swagger for API documentation, and MySQL for persistent storage.
</p>

---

## 📚 Project Overview

| Feature             | Description                                                                 |
|---------------------|-----------------------------------------------------------------------------|
| 🧑 Customer         | Register and retrieve customer data                                          |
| 🚗 Driver           | Add and manage drivers                                                       |
| 🚕 Cab              | Register cabs for the drivers                                                |
| 📍 Trip Booking     | Book a cab with pickup, destination & distance                               |
| 📧 Email Service    | Sends booking confirmation via Gmail SMTP                                    |
| 📘 Swagger Docs     | Provides an interactive API documentation                                    |
| 🔐 Secure Configs   | `.env` file for DB and email credentials                                     |

---

## 🔧 Tech Stack

| Layer        | Technology         |
|--------------|--------------------|
| Language     | Java 21            |
| Framework    | Spring Boot        |
| Database     | MySQL (DBeaver)    |
| ORM          | Spring Data JPA    |
| Email        | SMTP (Gmail)       |
| API Docs     | Swagger (Springdoc)|
| Testing Tool | Postman            |
| Build Tool   | Maven              |

---

## 🗂 Project Structure

```bash
tripease/
├── src/
│   ├── main/
│   │   ├── java/com/example/tripease/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── TripEaseApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
├── .env
├── pom.xml
├── .gitignore
└── README.md


⸻

📂 Environment Setup

Create a .env file in the root directory:

# MySQL DB Configuration
DB_URL=jdbc:mysql://localhost:3306/tripease-db
DB_USERNAME=root
DB_PASSWORD=your_password

# SMTP Email Config
EMAIL_USERNAME=your_email@gmail.com
EMAIL_PASSWORD=your_app_password

⚠️ Don’t push .env or application.properties to GitHub (they’re ignored in .gitignore).

⸻

🚀 API Usage Guide

Endpoint	Method	Description
/customer/add	POST	Add new customer
/customer/getAll	GET	Get all customers
/driver/add	POST	Add new driver
/cab/register	POST	Register a cab
/booking/book/customer/{id}	POST	Book cab for customer

🧪 Sample Booking Request (Postman - application/json)

{
  "pickup": "delhi",
  "destination": "pune",
  "tripDistanceInKm": 30
}


⸻

📘 Swagger UI

After starting the app, open http://localhost:8080/swagger-ui.html
→ Browse and test all endpoints with ease.

⸻

💻 Running Locally

▶️ Prerequisites

Tool	Required Version
Java	17 or higher (Java 21 used)
Maven	Latest
MySQL	8.x or compatible
IDE	IntelliJ / VS Code

▶️ Steps

# Clone the project
git clone https://github.com/your-username/tripease.git
cd tripease

# Add environment variables
cp .env.example .env
# (Edit DB and SMTP details)

# Start MySQL server and create DB (e.g., "tripease-db")

# Run Spring Boot app
./mvnw spring-boot:run


⸻

📸 Screenshots

<details>
<summary>🔍 Postman - Booking API</summary>


</details>


<details>
<summary>🧭 IntelliJ Project Structure</summary>


</details>

⸻

🙋‍♂️ About Me

Name	Aniket Pawar

📫 LinkedIn	[linkedin.com/in/your-profile](https://www.linkedin.com/in/aniket-pawar-2436bb240/)


⭐ Show Support

If you liked the project:
	•	Give it a ⭐ on GitHub
	•	Share with friends
	•	Connect on LinkedIn
