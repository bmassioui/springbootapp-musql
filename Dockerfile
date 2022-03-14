FROM maven:3.8.4 AS maven
LABEL maintainer="bouchaib.massioui@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app

# Clean & Install, test, Compile and package the application to an executable JAR
RUN mvn clean install
RUN mvn test
RUN mvn package

FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=springbootapp-musql-0.0.1-SNAPSHOT.jar

# Copy the springbootapp-musql-0.0.1-SNAPSHOT.jar from the maven stage to the /opt/app directory of the current stage.
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

WORKDIR /opt/app/

ENTRYPOINT ["java", "-jar", "springbootapp-musql-0.0.1-SNAPSHOT.jar"]