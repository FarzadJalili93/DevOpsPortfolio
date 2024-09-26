# Använd en lättvikts-Java-bild som bas
FROM openjdk:21-jdk-slim

# Metadata om bilden
LABEL authors="Farza"

# Skapa en arbetskatalog i containern
WORKDIR /app

# Kopiera den byggda Spring Boot-jar-filen till containern
COPY target/portfolio-0.0.1-SNAPSHOT.jar /app/portfolio.jar

# Exponera port 8080 (där Spring Boot körs)
EXPOSE 8080

# Starta Spring Boot-applikationen
ENTRYPOINT ["java", "-jar", "/app/portfolio.jar"]
