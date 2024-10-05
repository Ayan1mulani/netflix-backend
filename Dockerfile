# Use a base image with Maven and OpenJDK 17 to build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -e -X
# Copy the entire source code
COPY src ./src

# Build the application, skipping tests
RUN mvn clean package -DskipTests

# Use a slim OpenJDK image for the runtime environment
FROM openjdk:17-jdk-slim

# Set the working directory inside the runtime container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/Netflix-0.0.1-SNAPSHOT.jar .

# Expose the port that the application will run on
EXPOSE 4040

# Run the JAR file
ENTRYPOINT ["java", "-jar", "Netflix-0.0.1-SNAPSHOT.jar"]