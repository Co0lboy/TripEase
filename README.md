
# 🚗 TripEase - Travel Booking Web Application

TripEase is a backend web application built using **Java Spring Boot** that allows users to register, manage drivers and cabs, and book trips. The application integrates email notification using SMTP and provides interactive API documentation using Swagger.

---

## 🔧 Tech Stack

- **Java 21**
- **Spring Boot**
- **MySQL** (Managed via DBeaver)
- **Spring Data JPA**
- **Swagger** (SpringDoc OpenAPI)
- **SMTP (Gmail)** for sending emails
- **Postman** for API testing
- **Maven** for project build and dependency management

---

## 📌 Features

- ✅ Customer & Driver registration
- ✅ Cab registration
- ✅ Cab booking with dynamic distance & price calculation
- ✅ Auto-email confirmation on booking
- ✅ Role-based entity management
- ✅ API documentation using Swagger UI

---

## 🗂 Project Structure

TripEase/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/tripease/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   ├── transformer/
│   │   │   └── TripEaseApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│
├── .env
├── Dockerfile (Optional)
├── .gitignore
├── pom.xml
└── README.md

---

## ⚙️ Environment Variables (.env)

Ensure you create a `.env` file (not pushed to GitHub) with the following content:

```env
DB_URL=jdbc:mysql://localhost:3306/tripease-db
DB_USERNAME=your_mysql_username
DB_PASSWORD=your_mysql_password

EMAIL_USERNAME=your_email@gmail.com
EMAIL_PASSWORD=your_email_app_password


⸻

🧪 API Testing via Postman

You can test all endpoints using Postman. Sample endpoints:

GET     /customer/getAll
POST    /customer/add
GET     /driver/getAll
POST    /driver/add
POST    /cab/register
POST    /booking/book/customer/{customerId}

Sample JSON for booking:

{
  "pickup": "delhi",
  "destination": "pune",
  "tripDistanceInKm": 30
}


⸻

📘 Swagger UI

View all available APIs with Swagger UI once the server starts:

🔗 http://localhost:8080/swagger-ui.html

⸻

💻 Run Locally

Prerequisites
	•	Java 17+ (Java 21 recommended)
	•	Maven
	•	MySQL (use DBeaver for easy DB management)

Steps

# Clone repository
git clone https://github.com/your-username/tripease.git
cd tripease

# Add environment variables
cp .env.example .env
# (Update with your actual DB and SMTP details)

# Run the application
./mvnw spring-boot:run


⸻

🚀 Deployment

You can deploy this app on platforms like:
	•	Railway
	•	Render
	•	Heroku

(Deployment instructions are available in the docs/DEPLOY.md if needed.)

⸻

🙋‍♂️ Author

Aniket Pawar
👨‍🎓 B.E. in Robotics & Automation Engineering
📬 LinkedIn
💻 Skills: Java, Spring Boot, MySQL, REST APIs

⸻

⭐ Give a Star!

If you liked the project, don’t forget to ⭐ star the repo and follow for updates.
