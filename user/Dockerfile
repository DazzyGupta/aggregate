FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/user.jar"]