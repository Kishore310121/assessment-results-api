# Assessment Results API

This is a backend service developed using **Java** and **Spring Boot** that manages assessment result data. It allows adding and retrieving assessment records stored in a relational database.

## 🔧 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Postman (for testing)
- GitHub (version control)

## 📁 Module: Assessment Results

### ✅ Functionality
- **Add Assessment Result** (POST `/api/assessment-results`)
- **Get All Assessment Results** (GET `/api/assessment-results`)

### 📥 Input (POST request body) 
```json
{
  "quarterYear": "Q2-2025",
  "controlId": "CTRL-001",
  "quarterYearControlIdProviderEntityAssessmentType": "Q2-2025_CTRL-001_XYZ_ENT_KPI",
  "cOwner": "Owner A",
  "cOversight": "Oversight B",
  "selfAssessment": "Pass",
  "kpiAssessment": "Good",
  "kpiPeriod": "2025-H1",
  "complianceAssessment": "Compliant",
  "assessmentType": "KPI",
  "assessmentCoveragePeriod": "Jan-Jun 2025",
  "assId": "AS123"
}


