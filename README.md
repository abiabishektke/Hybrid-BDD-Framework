# 🧪 Selenium Hybrid BDD Framework (Sequential) with Jenkins

## 📌 Overview

This project is a **Hybrid Test Automation Framework** developed using **Selenium WebDriver with Cucumber (BDD)** and integrated with **Jenkins** for Continuous Integration.

The framework follows a **sequential execution model**, where test scenarios run one after another.

---

## 🚀 Features

* ✔️ BDD Framework using Cucumber
* ✔️ Page Object Model (POM) design
* ✔️ Sequential test execution
* ✔️ Maven-based project structure
* ✔️ Jenkins CI integration
* ✔️ Extent Reports for detailed reporting
* ✔️ Screenshot capture on test failure
* ✔️ Configurable browser execution

---

## 🛠️ Tech Stack

* **Java**
* **Selenium WebDriver**
* **Cucumber (BDD)**
* **Maven**
* **Jenkins**
* **Extent Reports**

---

## 📂 Project Structure

```
Selenium_Automation_Project
│
├── src/test/java
│   ├── stepdefinitions
│   ├── pages
│   ├── runners
│   └── utilities
│
├── src/test/resources
│   ├── features
│   └── config.properties
│
├── reports
│   └── extentReport.html
│
├── pom.xml
└── .gitignore
```

---

## ⚙️ Prerequisites

Make sure the following are installed:

* Java JDK (8 or above)
* Maven
* Git
* Jenkins

---

## ▶️ How to Run Tests Locally

1. Clone the repository:

```
git clone <repository-url>
```

2. Navigate to project folder:

```
cd Selenium_Automation_Project
```

3. Execute tests:

```
mvn clean test
```

---

## 🤖 Jenkins Integration

1. Create a new Jenkins job
2. Configure **Source Code Management → Git**
3. Add repository URL
4. Add build step:

```
clean test
```

5. Click **Build Now**

---

## 📊 Reports

* Extent Report is generated after execution
* Report location:

```
/reports/extentReport.html
```

* In Jenkins:

```
Workspace → Selenium_Automation_Project → reports → extentReport.html
```

---

## 🔁 Execution Flow

```
Feature File → Step Definitions → Page Objects → Selenium Actions → Report Generation
```

---

## 📌 Future Enhancements

* Parallel execution
* Docker integration
* Selenium Grid setup
* API automation integration
* Advanced CI/CD pipeline

---

## 👨‍💻 Author

**Abhishek**

---

## ⭐ Note

This project demonstrates a **real-time automation framework** using Selenium, BDD, and Jenkins suitable for industry-level test automation.
