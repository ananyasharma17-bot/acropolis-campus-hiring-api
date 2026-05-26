# 🚀 Railway Deployment - Step by Step Guide

## ✅ GitHub Repository Ready
**Repository URL:** https://github.com/ananyasharma17-bot/acropolis-campus-hiring-api

---

## 📋 Railway Deployment Steps

### Step 1: Go to Railway
Visit: **https://railway.app**

### Step 2: Sign Up / Login
- Click "Login" or "Start a New Project"
- Sign in with GitHub (recommended)
- Authorize Railway to access your GitHub account

### Step 3: Create New Project
1. Click **"New Project"**
2. Select **"Deploy from GitHub repo"**
3. Choose: **ananyasharma17-bot/acropolis-campus-hiring-api**
4. Click **"Deploy Now"**

### Step 4: Wait for Deployment
- Railway will automatically detect Spring Boot
- Build process will start (takes 2-5 minutes)
- Watch the deployment logs

### Step 5: Configure (if needed)
Railway should auto-detect everything, but if needed:
- **Build Command:** `mvn clean package -DskipTests`
- **Start Command:** `java -jar target/campus-hiring-1.0.0.jar`
- **Port:** 8080 (auto-detected)

### Step 6: Get Your Public URL
1. Go to **Settings** tab
2. Click **"Generate Domain"** under "Networking"
3. Copy your public URL (e.g., `https://your-app.railway.app`)

### Step 7: Test Your Deployed API
```bash
curl -X POST https://your-app.railway.app/bfhl \
  -H "Content-Type: application/json" \
  -d '{"data": ["a", "1", "334", "4", "R", "$"]}'
```

Or use PowerShell:
```powershell
$body = '{"data": ["a", "1", "334", "4", "R", "$"]}'
Invoke-RestMethod -Uri https://your-app.railway.app/bfhl -Method Post -Body $body -ContentType "application/json"
```

---

## 🎯 What to Submit

After deployment, submit:
1. **Railway Public URL** (e.g., `https://your-app.railway.app`)
2. **GitHub Repository URL:** https://github.com/ananyasharma17-bot/acropolis-campus-hiring-api
3. **API Endpoint:** `POST https://your-app.railway.app/bfhl`

---

## 🔧 Alternative: Railway CLI Method

If you prefer using CLI:

```bash
# Install Railway CLI
npm install -g @railway/cli

# Login
railway login

# Link to project
railway link

# Deploy
railway up
```

---

## 📊 Expected Deployment Logs

You should see:
```
Building...
[INFO] Building Acropolis Campus Hiring API 1.0.0
[INFO] BUILD SUCCESS
Starting application...
Started CampusHiringApplication in X.XXX seconds
Tomcat started on port(s): 8080 (http)
```

---

## ✅ Verification Checklist

After deployment:
- [ ] Railway build succeeded
- [ ] Application is running
- [ ] Public URL is generated
- [ ] API endpoint responds correctly
- [ ] Test with sample data works

---

## 🆘 Troubleshooting

### Build Fails
- Check Railway logs for errors
- Ensure Java 11+ is being used
- Verify pom.xml is correct

### Application Won't Start
- Check if port 8080 is configured
- Verify JAR file was created in target/
- Check Railway environment variables

### API Returns 404
- Ensure endpoint is `/bfhl` (not `/api/bfhl`)
- Check application logs in Railway dashboard

---

## 📞 Support

If you face issues:
1. Check Railway deployment logs
2. Verify GitHub repository is accessible
3. Ensure Railway has GitHub permissions
4. Check Railway community docs: https://docs.railway.app

---

## 🎉 Success!

Once deployed, your API will be live at:
**`https://your-app.railway.app/bfhl`**

Test it and submit the URL for your assessment!
