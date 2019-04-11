
FROM openjdk:8

COPY target/project-tracking-rpm-integration-1.0.jar project-tracking-rpm-integration-1.0.jar
COPY Users/ypeng/Documents/development Users/ypeng/Documents/development


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "project-tracking-rpm-integration-1.0.jar", "--server.port=8080"]

