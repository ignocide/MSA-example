FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/discovery-service.jar"]

