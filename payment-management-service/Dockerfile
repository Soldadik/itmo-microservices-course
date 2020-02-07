FROM openjdk:8-jre-alpine
MAINTAINER Eugen
COPY ./out/artifacts/payment_management_service_jar/payment-management-service.jar ./payment-management-service.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "payment-management-service.jar", "-Dspring.profiles.active=test"]
