# Layer de Dev (JDK para Desenvolver)
FROM openjdk:17-jdk-alpine as base

RUN apk update && apk upgrade
RUN apk add maven
RUN apk add git

# Layer de Shipment (Apenas JRE)
