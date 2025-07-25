<h1 align="center">🚕 TripEase - Cab Booking Backend Application</h1>

<p align="center">
  A RESTful web application for booking trips built using <strong>Java Spring Boot</strong>, <strong>MySQL</strong>, and <strong>Swagger</strong>.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.7-green?style=flat-square" />
  <img src="https://img.shields.io/badge/MySQL-DBeaver-blue?style=flat-square" />
  <img src="https://img.shields.io/badge/Postman-Tested-orange?style=flat-square" />
  <img src="https://img.shields.io/badge/Swagger-API-green?style=flat-square" />
</p>

---

## 🧰 Tech Stack

| Tech           | Description                        |
|----------------|------------------------------------|
| **Java 21**    | Backend language                   |
| **Spring Boot**| REST API framework                 |
| **MySQL**      | Database (via DBeaver)             |
| **JPA**        | ORM for data persistence           |
| **Postman**    | API testing                        |
| **Swagger**    | API documentation (SpringDoc)      |
| **SMTP (Gmail)**| Email service for trip confirmation |

---

## 📁 Project Structure

```bash
tripease/
├── src/main/java/com/example/tripease/
│   ├── controller/
│   ├── dto/
│   ├── model/
│   ├── repository/
│   ├── service/
│   ├── transformer/
│   └── TripEaseApplication.java
├── src/main/resources/
│   ├── application.properties
│   ├── static/
│   └── templates/
├── .env
├── .gitignore
├── pom.xml
└── README.md


⸻

🌐 API Endpoints

Method	Endpoint	Description
POST	/customer/add	Register new customer
GET	/customer/getAll	Get all customers
POST	/driver/add	Register driver
POST	/cab/register	Register new cab
POST	/booking/book/customer/{id}	Book cab for a customer
GET	/booking/getAll	View all bookings

🔖 Sample Booking Payload

{
  "pickup": "delhi",
  "destination": "pune",
  "tripDistanceInKm": 30
}


⸻

🛠️ Configuration

🔐 Environment Variables (.env)

Variable Name	Description
DB_URL	JDBC URL for MySQL database
DB_USERNAME	Your DB username
DB_PASSWORD	Your DB password
EMAIL_USERNAME	Your Gmail address
EMAIL_PASSWORD	App password for Gmail SMTP

📄 Example .env file

DB_URL=jdbc:mysql://localhost:3306/tripease-db
DB_USERNAME=root
DB_PASSWORD=yourpassword

EMAIL_USERNAME=youremail@gmail.com
EMAIL_PASSWORD=yourapppassword


⸻

🧪 API Testing (Postman)

Tool	Description
Postman	Use the request collection to test APIs
Swagger	Visit /swagger-ui.html in browser


⸻

🚀 Getting Started

Prerequisites
	•	Java 17 or 21
	•	Maven
	•	MySQL (DBeaver optional)

🧾 Build & Run Locally

# Clone the repo
git clone https://github.com/your-username/tripease.git
cd tripease

# Copy .env and update values
cp .env.example .env

# Build the project
./mvnw clean install

# Run the app
./mvnw spring-boot:run

Then, open http://localhost:8080/swagger-ui.html to explore the APIs.

⸻

📦 Deployment (Coming Soon)

Platform	Status	Link
Railway	🚧 To be deployed	
Render	❌ Not yet	
Docker	🛠 Optional	


⸻

👨‍💻 Author
Aniket Pawar	


⸻

⭐ Support

If you found this project helpful, please give it a ⭐ on GitHub and consider following for more!
