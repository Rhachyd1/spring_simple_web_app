FROM eclipse-temurin:17.0.9_9-jdk-jammy
WORKDIR /app
#COPY src ./src
COPY /target/spring-6-simplewebapp-0.0.1-SNAPSHOT.jar app.jar
#CMD ["./mvnw", "spring-boot:run"]
ENTRYPOINT ["java","-jar", "/app/app.jar"]