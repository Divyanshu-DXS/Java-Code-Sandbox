FROM eclipse-temurin:17-jre

WORKDIR /appDir

EXPOSE 9092

ARG JAR_FILE=target/*.jar

COPY ./target/docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/appDir/app.jar"]
