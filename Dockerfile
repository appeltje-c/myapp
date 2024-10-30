FROM openjdk:21-slim-buster

EXPOSE 8080

COPY target/myapp-*.jar myapp.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "myapp.jar"]