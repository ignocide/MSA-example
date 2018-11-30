FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/auth-service-0.0.1-SNAPSHOT.jar auth-service.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/auth-service.jar"]

