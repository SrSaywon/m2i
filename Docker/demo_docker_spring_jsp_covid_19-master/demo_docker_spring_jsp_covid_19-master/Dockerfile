FROM eclipse-temurin
ARG JAR_FIELD=target/*.war
COPY ${JAR_FIELD} app.war
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.war" ]