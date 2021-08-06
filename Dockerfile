FROM openjdk:11

WORKDIR /app

COPY target/mvc-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/mvc-0.0.1-SNAPSHOT.jar"]
