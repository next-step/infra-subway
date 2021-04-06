FROM openjdk:11-jre-slim
ADD build/libs/subway-0.0.1-SNAPSHOT.jar subway.jar
CMD java -jar -Dspring.profiles.active=prod subway.jar