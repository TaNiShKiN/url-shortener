# 🔗 URL Shortener

[![Java Version](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://java.com)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Ready-2496ED.svg)](https://docker.com)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A simple, fast, and efficient URL shortening service that converts long, unwieldy links into short, shareable URLs.

## ✨ Features

- 🔄 **URL Shortening** – Convert long URLs into compact short links
- ⚡ **Fast Redirects** – Instant 301/302 redirects to original destinations
- 📊 **Basic Analytics** (if implemented) – Track click counts and referrers
- 🐳 **Docker Ready** – Run anywhere with containerization
- 🚀 **Spring Boot Powered** – Built on a robust, production-ready framework

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| **Java 17+** | Core programming language |
| **Spring Boot 3.x** | Application framework & REST APIs |
| **Maven** | Build automation & dependency management |
| **Docker** | Containerization & deployment |

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed on your system:

- [Docker](https://docs.docker.com/get-docker/) (recommended) or
- [Java 17+](https://adoptium.net/) and [Maven 3.8+](https://maven.apache.org/download.cgi) (for local development)

### Option 1: Run with Docker (Recommended)

```bash
# Step 1: Clone the repository
git clone https://github.com/TaNiShKiN/url-shortener.git
cd url-shortener

# Step 2: Build the Docker image
docker build -t url-shortener .

# Step 3: Run the container
docker run -p 8080:8080 url-shortener
