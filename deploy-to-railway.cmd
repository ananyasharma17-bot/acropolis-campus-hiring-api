@echo off
echo ========================================
echo Railway Deployment Script
echo ========================================
echo.

echo Step 1: Logging into Railway...
echo (This will open your browser for authentication)
railway login
echo.

echo Step 2: Creating new Railway project...
railway init
echo.

echo Step 3: Linking to GitHub repository...
railway link
echo.

echo Step 4: Deploying application...
railway up
echo.

echo ========================================
echo Deployment Complete!
echo ========================================
echo.
echo To get your public URL, run:
echo   railway domain
echo.
echo Or visit Railway dashboard:
echo   railway open
echo.
pause
