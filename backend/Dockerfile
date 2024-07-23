FROM openjdk:17
LABEL authors="Makhanov"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/backend.jar"]
