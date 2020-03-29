FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} order.jar
EXPOSE 8010
ENTRYPOINT ["java","-jar","/order.jar"]