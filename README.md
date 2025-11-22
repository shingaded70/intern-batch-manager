# Intern & Batch Management System  
✅ **Spring Boot Backend** | Auto ID: `EMP20251122-001` / `TDA20251122-001`  

A RESTful backend for managing interns and training batches with auto-generated IDs, batch assignment, and 6-month auto-expiry.

## ✨ Features
- `POST /api/interns` → Auto-generates `EMP{YYYYMMDD}-{NNN}` (Premium) or `TDA{YYYYMMDD}-{NNN}` (Free)  
- `POST /api/batches` → Auto sets end date = start date + 6 months  
- Full CRUD + search by name, batch, ID type  

## 🚀 Run Locally
```bash
mvn spring-boot:run
# Then test:
curl -X POST http://localhost:8080/api/batches -H "Content-Type: application/json" -d '{"startDate":"2025-11-22"}'
curl -X POST http://localhost:8080/api/interns -H "Content-Type: application/json" -d '{"name":"Dhiraj","email":"shingaded70@gmail.com","mobile":"9876543210","idCardType":"Premium","dateOfJoining":"2025-11-22","batch":{"id":1}}'
 
🔧 Tech: Java 17, Spring Boot 3.3.5, H2 (in-memory), Maven
👤 Author: Dhiraj Sharad Shingade (shingaded70)


✅ Total lines: **24** (including code block) — clean, scannable, and impressive.

---

### ✅ How to add it:
1. In `C:\intern-batch-manager\`, create file: `README.md`  
2. Paste the above content  
3. Commit & push:
   ```powershell
   git add README.md
   git commit -m "docs: add concise README for portfolio"
   git push
