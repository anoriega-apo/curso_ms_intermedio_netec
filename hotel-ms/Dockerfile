#imagen base
FROM openjdk:11-jdk-slim
#Donde se va a copiar el jar
#Creacion de un espacio de trabajo
WORKDIR /app
RUN mkdir ./logs

COPY target/hotel-ms-0.0.1-SNAPSHOT.jar .
ENV PORT 9090
EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "hotel-ms-0.0.1-SNAPSHOT.jar"]