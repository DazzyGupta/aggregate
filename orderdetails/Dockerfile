FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} orderdetails.jar
EXPOSE 8020
ENTRYPOINT ["java","-jar","/orderdetails.jar"]