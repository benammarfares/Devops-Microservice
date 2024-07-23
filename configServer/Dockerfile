FROM openjdk:20
EXPOSE 8888
ADD target/configServer.jar configServer.jar
ENTRYPOINT ["java", "-jar", "configServer.jar"]
