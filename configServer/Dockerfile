FROM tomcat
WORKDIR webapps
COPY target/configServer.war .
RUN rm -rf ROOT && mv configServer.war ROOT.war
EXPOSE 8888
ENTRYPOINT ["sh", "/usr/local/tomcat/bin/startup.sh"]