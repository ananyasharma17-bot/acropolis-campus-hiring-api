# Acropolis Campus Hiring API - Complete Deployment Guide

## ✅ Project Created Successfully

### Files Created:
- ✅ `pom.xml` - Maven configuration
- ✅ `src/main/java/com/acropolis/campushiring/CampusHiringApplication.java` - Main application
- ✅ `src/main/java/com/acropolis/campushiring/controller/BfhlController.java` - Controller
- ✅ `src/main/java/com/acropolis/campushiring/dto/BfhlRequest.java` - Request DTO
- ✅ `src/main/java/com/acropolis/campushiring/dto/BfhlResponse.java` - Response DTO
- ✅ `src/test/java/com/acropolis/campushiring/BfhlControllerTest.java` - Test cases
- ✅ `src/main/resources/application.properties` - Configuration
- ✅ `Postman_Test.json` - Postman collection
- ✅ `README.md` - Documentation

### Files to DELETE (if old Bajaj code exists):
Since the workspace was empty, no old files needed deletion. If you had old Bajaj code:
- Delete old `/bfhl` mappings in controllers
- Delete conflicting DTOs
- Delete old service/repository layers
- Remove any duplicate route mappings

---

## 🚀 How to Run

### Prerequisites:
1. **Java 17** or higher
2. **Maven 3.6+**

### Commands:

#### Build the project:
```bash
mvn clean package
```

#### Run the application:
```bash
mvn spring-boot:run
```

#### Run tests:
```bash
mvn test
```

The API will start on: `http://localhost:8080`

---

## 📮 API Testing

### Using Postman:
1. Import `Postman_Test.json` into Postman
2. Run the "BFHL POST Request" test

### Manual cURL Test:
```bash
curl -X POST http://localhost:8080/bfhl \
  -H "Content-Type: application/json" \
  -d "{\"data\": [\"a\", \"1\", \"334\", \"4\", \"R\", \"$\"]}"
```

### Expected Response:
```json
{
  "is_success": true,
  "user_id": "ananya_sharma_17012005",
  "email": "ananyasharma231341@acropolis.in",
  "roll_number": "0827CY231012",
  "odd_numbers": ["1"],
  "even_numbers": ["334", "4"],
  "alphabets": ["A", "R"],
  "special_characters": ["$"],
  "sum": "339",
  "concat_string": "Ra"
}
```

---

## ☁️ Railway Deployment Steps

### Method 1: GitHub Integration (Recommended)
1. Push code to GitHub repository
2. Go to [railway.app](https://railway.app)
3. Sign up/Login with GitHub
4. Click **"New Project"**
5. Select **"Deploy from GitHub repo"**
6. Choose your repository
7. Railway auto-detects Spring Boot
8. Click **"Deploy"**
9. Wait for build to complete
10. Get your public URL from Railway dashboard

### Method 2: Railway CLI
```bash
# Install Railway CLI
npm install -g @railway/cli

# Login
railway login

# Initialize project
railway init

# Deploy
railway up
```

### Method 3: Direct Deploy
1. Create new project on Railway
2. Select "Deploy from local"
3. Railway CLI will upload your code
4. Automatic deployment starts

### Environment Variables (if needed):
- `PORT` - Railway sets automatically
- `JAVA_VERSION` - Set to 17 if needed

---

## 🧪 Test Cases Included

The project includes 2 test cases:

1. **testBfhlEndpoint** - Tests basic functionality with mixed input
2. **testMultiCharacterAlphabets** - Tests multi-character string handling

Both tests verify:
- HTTP 200 status
- Correct response structure
- Proper data categorization
- Correct concat_string logic

---

## 📁 Project Structure

```
campus-hiring/
├── pom.xml
├── README.md
├── DEPLOYMENT_GUIDE.md
├── Postman_Test.json
├── .gitignore
└── src/
    ├── main/
    │   ├── java/com/acropolis/campushiring/
    │   │   ├── CampusHiringApplication.java
    │   │   ├── controller/
    │   │   │   └── BfhlController.java
    │   │   └── dto/
    │   │       ├── BfhlRequest.java
    │   │       └── BfhlResponse.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/com/acropolis/campushiring/
            └── BfhlControllerTest.java
```

---

## ✨ Implementation Details

### Logic Implemented:
- ✅ Odd/even number detection (as strings)
- ✅ Alphabet extraction (uppercase conversion)
- ✅ Multi-character string handling
- ✅ Special character detection
- ✅ Sum calculation (returned as string)
- ✅ Concat string with reverse + alternating caps

### Key Features:
- Minimal architecture (no service/repository layers)
- Clean, readable code
- Assessment-focused implementation
- No overengineering
- Spring Web only (no extra dependencies)

---

## 🎯 User Details (Hardcoded as Required)

```
user_id: ananya_sharma_17012005
email: ananyasharma231341@acropolis.in
roll_number: 0827CY231012
```

---

## 🔍 Troubleshooting

### Maven not found:
Install Maven from: https://maven.apache.org/download.cgi

### Java version issues:
Ensure Java 17+ is installed:
```bash
java -version
```

### Port already in use:
Change port in `application.properties`:
```properties
server.port=8081
```

### Railway deployment fails:
- Ensure `pom.xml` is in root directory
- Check Java version is 17+
- Verify build succeeds locally first

---

## 📝 Notes

- No GET endpoint implemented (as per requirements)
- No database/JPA (not required)
- No security/JWT (not required)
- No Swagger (not required)
- No Lombok (keeping it simple)
- Numbers remain as STRINGS in response
- Implementation follows PDF requirements EXACTLY

---

## ✅ Checklist

- [x] POST /bfhl endpoint created
- [x] Request DTO implemented
- [x] Response DTO implemented
- [x] Test cases added
- [x] Odd/even number logic
- [x] Alphabet uppercase conversion
- [x] Special character detection
- [x] Sum calculation
- [x] Concat string with alternating caps
- [x] User details hardcoded
- [x] Postman collection created
- [x] README documentation
- [x] Railway deployment guide

---

**Project Status: ✅ READY FOR DEPLOYMENT**
