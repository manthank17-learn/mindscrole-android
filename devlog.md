# 📓 Mindscrole Dev Log

---

## 📅 2026-01-02 — Major Pivot: Desktop Automation → Android Share Sheet MVP

### Context
Initial versions of **Mindscrole** focused on backend-first automation:
- Instagram link ingestion via CLI tools, private APIs (instagrapi), Selenium, and DMs
- Server-side processing on Ubuntu (yt-dlp → ffmpeg → Whisper)

During experimentation, several hard constraints became obvious:
- Instagram private APIs are unstable and high-risk (IP blocks, challenges, bans)
- DM scraping and automation violate ToS and break unpredictably
- Most users do **not use Instagram on desktop**
- Multi-step desktop workflows introduce friction and kill adoption

This forced a **product rethink**, not just a technical fix.

---

### Strategic Pivot
We pivoted from **“automated ingestion”** to **“user-intent driven ingestion.”**

**Key insight:**
> The safest, fastest, and most scalable trigger is explicit user intent on mobile.

Instead of reading Instagram data in the background:
- The user explicitly shares a Reel
- The system processes **only what the user chooses**
- No scraping, no session hijacking, no background automation

This led to **Mindscrole Android**.

---

### What Changed
**From:**  
Backend-centric Instagram automation

**To:**  
Mobile-first Android Share Sheet application

The Android app acts as a **trusted bridge**:
- Instagram stays on the user’s phone
- Mindscrole receives only a public URL
- Backend never touches Instagram directly

---

### What Was Built Today (Android MVP)

#### ✅ Android Share Sheet App (MindscroleShare)
- Native Android app built using **Android Studio + Kotlin**
- Registered as a **Share Target** for `text/plain`
- Appears in Android’s system share menu
- Successfully receives shared Instagram Reel URLs

#### ✅ Intent Handling
- Handles `Intent.ACTION_SEND`
- Extracts shared text (Reel URL)
- Displays received content for confirmation
- Confirms end-to-end flow: Instagram → Mindscrole app

#### ✅ Local Device Testing
- Tested live on **Samsung A31** via USB debugging
- Verified real Instagram app → Share → Mindscrole
- Confirmed stability and correct intent handling

#### ✅ UX Observation
- Current flow requires ~3 taps
- Acceptable friction: reinforces *intentional processing*
- Mental pause before sending aligns with “worth processing” philosophy

---

### Git & Engineering Hygiene
- Android project initialized as a **separate Git repository**
- Connected to GitHub (`mindscrole-android`)
- Commits verified under correct author identity
- Android Studio ↔ GitHub workflow validated
- Clean separation between:
  - Backend repo (`mindscrole`)
  - Mobile client repo (`mindscrole-android`)

---

### Why This Pivot Matters
This transition fundamentally reshaped Mindscrole:

- 🚫 No ToS-breaking automation
- 🔒 No account or IP risk
- 📱 Mobile-native UX
- 🧠 Explicit user intent
- ⚙️ Clean, modular backend pipeline

Mindscrole is no longer *trying to read Instagram*.  
It **listens only when the user speaks**.

---

## 🚀 Next Steps

### Phase 3 — Android → Backend Integration
- Add network call from Android app to backend API
- POST shared URL to Ubuntu service (localhost first)
- Handle success / failure responses

### Phase 4 — UX Refinement
- Add explicit “Send to Mindscrole” confirmation UI
- Show processing status (queued / sent)
- Reduce taps where possible without removing intent

### Phase 5 — MVP Distribution
- Generate signed debug APK
- Share with 3–5 trusted testers
- Collect friction + usability feedback

### Phase 6 — Backend Enrichment
- Auto-trigger existing transcription pipeline
- Store transcript + metadata
- Prepare for future structuring (events, hiring, deadlines)

---

**Status:**  
✅ Android Share Sheet MVP complete  
✅ Backend transcription pipeline stable  
🔜 System integration and MVP onboarding next
