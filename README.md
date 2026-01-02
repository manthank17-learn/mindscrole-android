# Mindscrole

Mindscrole is a **personal knowledge intake and prioritization system** designed for people who consume high-signal information through short-form content.

It helps transform scattered Instagram Reels, videos, and links into **structured, searchable, and prioritized knowledge**—without scraping platforms or violating user trust.

---

## The Problem

Most valuable information today is discovered through:
- Instagram Reels
- Short videos
- Social media snippets
- Event announcements
- Hiring posts and opportunities

But this information is:
- Ephemeral
- Unstructured
- Hard to track
- Easy to forget
- Buried inside feeds and timelines

Mindscrole exists to **capture intent at the moment of discovery** and turn it into something usable.

---

## The Core Idea

Mindscrole does **not** scrape platforms or automate user accounts.

Instead, it is built around one principle:

> **Only process content when the user explicitly chooses to.**

The user decides what is worth saving.

---

## System Architecture (High Level)

Mindscrole is composed of four core layers:

---

### 📱 Android App — Intent Capture

- Native Android application
- Integrated with the system **Share Sheet**
- Appears when a user shares content from Instagram or other apps
- Receives only what the user explicitly shares (usually a public URL)
- Acts as a trusted bridge between social apps and the backend

The Android app is intentionally minimal:
- No scraping
- No background automation
- No access to private data
- Pure user-initiated action

---

### 🖥️ Backend — Ubuntu Processing Node

- Runs on a dedicated Ubuntu machine
- Responsible for:
  - Media handling
  - Audio extraction
  - File management
  - Transcription
  - Metadata storage

Core responsibilities:
- Downloading shared media when applicable
- Converting media formats
- Running speech-to-text on short-form content
- Persisting transcripts and references

This layer is built for **stability, reproducibility, and control**.

---

### 🧠 Intelligence Layer — LLM & Prioritization (Python)

On top of raw transcripts, Mindscrole applies intelligence:

- Language understanding
- Content categorization
- Priority assignment
- Signal vs noise separation

Examples:
- Job opportunity vs general advice
- Event with a date vs timeless content
- Hiring announcement vs opinion
- High urgency vs long-term reference

This layer is designed to evolve over time into a **personal decision support system**.

---

### 🌐 Frontend — Unified Access (React)

A web frontend provides:
- Centralized access to everything processed by Mindscrole
- Clean views of transcripts and extracted information
- Categorized timelines (events, hiring, learning, ideas)
- One place to review what the user chose to save

The frontend is the **single source of truth** for the user.

---

## What Mindscrole Is Not

- Not a scraper
- Not an Instagram automation tool
- Not a growth hack
- Not a background crawler

Mindscrole only works when **the user says “this matters.”**

---

## Why This Approach

- Respects platform boundaries
- Avoids account bans and instability
- Aligns with real user behavior (mobile-first)
- Scales without violating trust
- Keeps the system legally and technically sane

---

## Current Status

- Android Share Sheet MVP: **Working**
- Backend transcription pipeline: **Stable**
- Intelligence layer: **In progress**
- Frontend: **Planned**

---

## Vision

Mindscrole aims to become:
- A personal intake system for high-signal information
- A memory extension for short-form knowledge
- A prioritization engine for opportunities and ideas
- A calm alternative to saving chaos

You don’t scroll less.  
You **lose less**.

---

Mindscrole is built deliberately, slowly, and with intent.
