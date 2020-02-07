FROM openjdk:8-jre-alpine
MAINTAINER Eugen
COPY ./out/artifacts/api_gateway_service_jar/api-gateway-service.jar ./api-gateway-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "api-gateway-service.jar", "-Dspring.profiles.active=test"]
