FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/ProjectFinal-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_materia_espe.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app_materia_espe.jar"]