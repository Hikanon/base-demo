FROM openjdk:17
LABEL authors="Makhanov"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} database.jar
EXPOSE 7075
ENTRYPOINT ["java","-jar","/database.jar"]
