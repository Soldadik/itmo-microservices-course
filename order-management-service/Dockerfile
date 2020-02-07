FROM openjdk:8-jre-alpine
MAINTAINER Eugen
COPY ./out/artifacts/order_management_service_jar/order-management-service.jar ./order-management-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "order-management-service.jar", "-Dspring.profiles.active=test"]
