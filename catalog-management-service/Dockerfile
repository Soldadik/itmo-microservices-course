FROM openjdk:8-jre-alpine
MAINTAINER Eugen
COPY ./out/artifacts/catalog_management_service_jar/catalog-management-service.jar ./catalog-management-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "catalog-management-service.jar", "-Dspring.profiles.active=test"]
