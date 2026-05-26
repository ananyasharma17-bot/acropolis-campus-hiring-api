# 🚀 DEPLOY TO RAILWAY NOW - 5 MINUTE GUIDE

## ✅ Everything is Ready!
- GitHub Repo: https://github.com/ananyasharma17-bot/acropolis-campus-hiring-api
- Code: Tested and working
- Railway CLI: Installed

---

## 🎯 OPTION 1: Railway Web Dashboard (EASIEST - 3 MINUTES)

### Step-by-Step:

1. **Open Railway**
   - Go to: https://railway.app
   - Click "Login" (top right)

2. **Login with GitHub**
   - Click "Login with GitHub"
   - Authorize Railway (if asked)

3. **Create New Project**
   - Click "New Project" button
   - Select "Deploy from GitHub repo"
   - Find and click: **acropolis-campus-hiring-api**
   - Click "Deploy Now"

4. **Wait for Build** (2-3 minutes)
   - Watch the logs
   - Wait for "Build Successful"
   - Wait for "Deployment Live"

5. **Get Your URL**
   - Click "Settings" tab
   - Scroll to "Networking" section
   - Click "Generate Domain"
   - Copy your URL: `https://acropolis-campus-hiring-api-production.up.railway.app`

6. **Test It!**
   ```powershell
   $body = '{"data": ["a", "1", "334", "4", "R", "$"]}'
   Invoke-RestMethod -Uri https://YOUR-URL.railway.app/bfhl -Method Post -Body $body -ContentType "application/json"
   ```

7. **DONE! Submit your URL** ✅

---

## 🎯 OPTION 2: Railway CLI (ALTERNATIVE - 2 MINUTES)

### Run these commands in PowerShell:

```powershell
# Step 1: Login (opens browser)
railway login

# Step 2: Initialize project
railway init

# Step 3: Deploy
railway up

# Step 4: Generate domain
railway domain

# Step 5: Open dashboard
railway open
```

### Or just run:
```cmd
deploy-to-railway.cmd
```

---

## 🎯 OPTION 3: Manual Railway CLI Steps

Open PowerShell in this folder and run:

### 1. Login to Railway
```bash
railway login
```
- Browser will open
- Click "Authorize"
- Return to terminal

### 2. Create Project
```bash
railway init
```
- Select "Empty Project"
- Name it: acropolis-campus-hiring-api

### 3. Link to GitHub (Optional)
```bash
railway link
```
- Select your project

### 4. Deploy
```bash
railway up
```
- Wait for deployment (2-3 minutes)

### 5. Generate Public URL
```bash
railway domain
```
- Copy the generated URL

### 6. Test Your API
```bash
curl -X POST https://your-url.railway.app/bfhl \
  -H "Content-Type: application/json" \
  -d '{"data": ["a", "1", "334", "4", "R", "$"]}'
```

---

## 📋 What You'll Get

After deployment:
- **Public URL:** `https://acropolis-campus-hiring-api-production.up.railway.app/bfhl`
- **Status:** Live and accessible
- **Endpoint:** POST /bfhl

---

## 🆘 Troubleshooting

### Railway CLI not working?
Use **OPTION 1** (Web Dashboard) - it's easier!

### Build fails?
- Check Railway logs
- Ensure Java 11+ is selected
- Verify nixpacks.toml is present

### Can't generate domain?
- Go to Settings → Networking
- Click "Generate Domain"
- Wait a few seconds

---

## ✅ RECOMMENDED: Use Web Dashboard (Option 1)

It's the fastest and most reliable method!

**Start here:** https://railway.app

---

## 📝 After Deployment

Submit these for your assessment:
1. **Railway URL:** https://your-app.railway.app
2. **GitHub Repo:** https://github.com/ananyasharma17-bot/acropolis-campus-hiring-api
3. **API Endpoint:** POST /bfhl

---

## 🎉 You're Almost Done!

Just follow Option 1 (Web Dashboard) and you'll be deployed in 3 minutes!
