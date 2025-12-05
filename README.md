# NASA API Client

A simple Java library for interacting with various NASA APIs.

## Features

- **APOD** - Astronomy Picture of the Day
- **NeoWs** - Near Earth Object Web Service
- **EPIC** - Earth Polychromatic Imaging Camera
- **InSight** - Mars Weather Service
- **OSDR** - Open Science Data Repository
- **TLE** - Two-Line Element satellite tracking data

## Requirements

- Java 17+
- Jackson Databind 2.20.0+

## Installation

Add the JAR to your project dependencies or build from source:

```bash
mvn clean package
```

## Usage

### Basic Setup

```java
NasaApiClient nasa = new NasaApiClient();
```

### Get Astronomy Picture of the Day

```java
ApodResponseDto apod = nasa.apod().getData(Map.of(
    "api_key", "YOUR_API_KEY"
));
```

### Get Near Earth Objects

```java
NeoWsResponseDto neo = nasa.neo().getData(Map.of(
    "api_key", "YOUR_API_KEY",
    "start_date", "2025-01-01",
    "end_date", "2025-01-08"
));
```

### Get Earth Polychromatic Imaging Camera

```java
EpicResponseDto[] epic = nasa.epic().getData(Map.of());
```

### Get Mars Weather Data

```java
InSightResponseDto insight = nasa.insight().getData(Map.of(
    "api_key", "YOUR_API_KEY",
    "feedtype", "json",
    "ver", "1.0"
));
```

### Get OSDR Study Files

```java
OsdrResponseDto osdr = nasa.osdr().getData(87, Map.of());
```

### Get Satellite TLE Data

```java
TleResponseDto tle = nasa.tle().getData(Map.of(
    "search", "ISS"
));
```

## API Key

Get your free NASA API key at: https://api.nasa.gov/

For testing, you can use `DEMO_KEY` but it has rate limits.

## Error Handling

```java
try {
    ApodResponseDto apod = nasa.apod().getData(Map.of("api_key", "YOUR_KEY"));
} catch (ApiException e) {
    System.out.println("Error: " + e.getErrorMessage());
    System.out.println("Status: " + e.getStatusCode());
} catch (IOException | InterruptedException e) {
    System.out.println("Network error: " + e.getMessage());
}
```