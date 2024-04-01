# Use official OpenJDK 11 image as base image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY ./target/spring-data-dog-refuge-*.jar /app/spring-data-dog-refuge.jar

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "/app/spring-data-dog-refuge.jar"]

EXPOSE 8080

