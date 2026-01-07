# Multi Stage Docker Build Approach
# Building The Jar File On Every Docker Build
FROM maven:3.9-eclipse-temurin-17 AS JarBuild

WORKDIR /build

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests

# Once the build above is completed, we will then freshly run the app using the new jar file built
FROM eclipse-temurin:17-jre

WORKDIR /appDir

EXPOSE 9092

COPY --from=JarBuild build/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
