FROM maven:3.8.7-eclipse-temurin-17

USER root

# Install Docker CLI
RUN apt-get update && \
    apt-get install -y docker.io && \
    apt-get clean

WORKDIR /app

