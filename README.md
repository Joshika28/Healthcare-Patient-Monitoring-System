# 🏥 Healthcare Patient Monitoring System

## 📌 Overview

A backend healthcare system built using Spring Boot and PostgreSQL to manage patients and their health records such as heart rate and blood pressure.

---

## 🚀 Tech Stack

* Java
* Spring Boot
* PostgreSQL
* Spring Data JPA (Hibernate)
* REST APIs
* Postman (Testing)

---

## 🔥 Features

* Create, Read, Update, Delete (CRUD) operations for patients
* Store and manage health records for each patient
* One-to-Many relationship between Patient and Health Records
* Automatic database table creation using Hibernate
* Alert system for abnormal heart rate

---

## 📊 API Endpoints

### 👤 Patient APIs

* POST `/patients` → Add new patient
* GET `/patients` → Get all patients
* PUT `/patients/{id}` → Update patient
* DELETE `/patients/{id}` → Delete patient

---

### ❤️ Health Record APIs

* POST `/records/patient/{patientId}` → Add health record
* GET `/records` → Get all records
* GET `/records/patient/{patientId}` → Get records by patient

---

## 🧪 Sample Request

### Add Patient

```json
{
  "name": "Meera",
  "age": 20,
  "condition": "Fever"
}
```

### Add Health Record

```json
{
  "heartRate": 82,
  "bp": "120/80"
}
```

---

## ⚙️ How to Run

1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Run:

```
mvn spring-boot:run
```

4. Test APIs using Postman

---

## 💼 Resume Highlight

Developed a healthcare backend system using Spring Boot and PostgreSQL with full CRUD operations and relational data modeling between patients and health records.
