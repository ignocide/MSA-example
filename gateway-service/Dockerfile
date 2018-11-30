FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/gateway-service-0.0.1-SNAPSHOT.jar gateway-service.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gateway-service.jar"]

