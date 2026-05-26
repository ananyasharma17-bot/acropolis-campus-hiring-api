# Acropolis Campus Hiring API - May 2026

## API Endpoint
- **Method**: POST
- **Route**: `/bfhl`
- **Status**: 200 OK

## Request Format
```json
{
  "data": ["a", "1", "334", "4", "R", "$"]
}
```

## Response Format
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

## Run Commands

### Build
```bash
mvn clean package
```

### Run
```bash
mvn spring-boot:run
```

### Test
```bash
mvn test
```

## Postman Test Request

**POST** `http://localhost:8080/bfhl`

**Headers:**
```
Content-Type: application/json
```

**Body (raw JSON):**
```json
{
  "data": ["a", "1", "334", "4", "R", "$"]
}
```

## Railway Deployment

1. Create account at [railway.app](https://railway.app)
2. Click "New Project" → "Deploy from GitHub repo"
3. Select your repository
4. Railway auto-detects Spring Boot (Maven)
5. Set environment variables if needed
6. Deploy automatically starts
7. Get public URL from Railway dashboard

**Alternative - Railway CLI:**
```bash
npm install -g @railway/cli
railway login
railway init
railway up
```

## Project Structure
```
src/
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
