FROM openjdk:8-jre-alpine
MAINTAINER Eugen
COPY ./out/artifacts/eureka_service_jar/eureka-service.jar ./eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-service.jar", "-Dspring.profiles.active=test"]
