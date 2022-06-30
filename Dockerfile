#FROM registry.company.com.br:5005/company-containers/java-11-smallest-debian
FROM registry.company.com.br:5005/company-containers/docker-java:develop

RUN mkdir /opt/app
RUN chmod 777 -R /opt/app

RUN mkdir /config
RUN chmod 777 -R /config


WORKDIR /opt/app

ADD ./src/main/resources/application.yml /config/
ADD ./target/CI_PROJECT_NAME.jar /opt/app/CI_PROJECT_NAME.jar

ENTRYPOINT ["java", "-jar", "/opt/app/CI_PROJECT_NAME.jar", "--spring.config.name=application" ," --spring.config.location=file:///config/"]
