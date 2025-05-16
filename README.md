# 📝 Hibernate ToDoList Application

A simple Java-based ToDo List application using **Hibernate ORM** to perform basic **CRUD** operations with a MySQL database. This project is designed for learning Hibernate without using Spring Boot and is ideal for beginners in Java and ORM concepts.

---

## 📌 Features

- ✅ Create a new Task
- 📖 Read (Retrieve) Task by ID
- ✏️ Update existing Task
- ❌ Delete Task
- 🔗 Connect to MySQL using Hibernate
- 💡 Easily extendable for REST API or frontend integration

---

## 💻 Technologies Used

- Java  
- Hibernate ORM  
- MySQL  
- Maven  
- JPA (Jakarta Persistence API)

---

## 📁 Project Structure

ToDoList-Hibernate/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/pavan/hibernate/ToDoList/
│ │ │ ├── App.java
│ │ │ └── Entity/
│ │ │ └── Task.java
│ │ └── resources/
│ │ └── hibernate.cfg.xml
│
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## ⚙️ Setup & Run Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/ToDoList-Hibernate.git
cd ToDoList-Hibernate
2. Update Database Configuration
Edit the hibernate.cfg.xml file with your MySQL database credentials.

3. Create MySQL Table
sql
Copy
Edit
CREATE DATABASE ToDoListDB;

USE ToDoListDB;

-- Hibernate will create the `Task_Manager` table automatically using annotations.
4. Run the Project
You can run it using your IDE or from the command line:

bash
Copy
Edit
mvn compile
mvn exec:java -Dexec.mainClass="com.pavan.hibernate.ToDoList.App"
🔄 CRUD Operations
All operations are performed using Hibernate sessions inside App.java:

session.persist(task) to create

session.get(Task.class, id) to read

task.setTitle(...) + session.update(task) to update

session.remove(task) to delete

🚀 Future Enhancements
Add REST APIs using JAX-RS or Spring MVC

Create a frontend using React, HTML, or AJAX

Add validation and exception handling

Use DTOs for API responses

Dockerize the application

🙋‍♂️ Author
Pavan Kumar Reddy Tekula
📍 Dallas, TX
📧 LinkedIn (www.linkedin.com/in/pawan-reddy-7479b2191)
(+1 682-392-2632)







