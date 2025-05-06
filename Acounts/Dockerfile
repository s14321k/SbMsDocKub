# Use a base image with Java 21
FROM openjdk:21-jdk-slim

# Who is the maintainer
MAINTAINER sarath

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/Acounts-0.0.1-SNAPSHOT.jar Acounts-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "Acounts-0.0.1-SNAPSHOT.jar"]