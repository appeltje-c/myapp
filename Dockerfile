FROM openjdk:21-slim-buster

EXPOSE 8080

COPY target/myapp-0.0.1-SNAPSHOT.jar myapp.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "myapp.jar"]