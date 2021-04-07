FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#FROM openjdk:11-jre-slim
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} subway.jar
#ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/subway.jar"]