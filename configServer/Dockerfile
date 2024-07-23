FROM amazon/corretto:17.0.8
ADD target/configServer.jar configServer.jar
ENTRYPOINT ["java", "-jar", "/configServer.jar"]
EXPOSE 8888
