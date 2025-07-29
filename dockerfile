FROM openjdk:17-jdk-slim

LABEL maintainer=kavyak-2305

WORKDIR /app

ARG JAR_FILE=target/registrationForm-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
