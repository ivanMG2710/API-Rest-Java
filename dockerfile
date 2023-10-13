FROM openjdk:11
COPY target/rest-0.0.1-SNAPSHOT.jar java-app.jar
ENTRYPOINT ["java", "-jar", "java-app.jar"]

