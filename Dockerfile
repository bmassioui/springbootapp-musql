FROM openjdk:17-jdk-alpine
LABEL maintainer="bouchaib.massioui@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE}} springbootapp-musql-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springbootapp-musql-0.0.1-SNAPSHOT.jar"]