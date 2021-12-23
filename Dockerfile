FROM openjdk:11
WORKDIR /app
COPY adapters/target/adapters-0.0.1-SNAPSHOT.jar /app/api-bank.jar
ENTRYPOINT ["java","-jar","api-bank.jar"]