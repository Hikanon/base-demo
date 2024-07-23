FROM openjdk:17
LABEL authors="Makhanov"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} authentication.jar
EXPOSE 7070
ENTRYPOINT ["java","-jar","/authentication.jar"]
