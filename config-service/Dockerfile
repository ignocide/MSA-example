FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/config-service-0.0.1-SNAPSHOT.jar config-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-service.jar"]