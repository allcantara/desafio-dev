FROM openjdk:17

WORKDIR /bycoders/api

COPY target/bycoders-0.0.1-SNAPSHOT.jar /bycoders/api/api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api.jar"]