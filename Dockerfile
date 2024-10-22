FROM openjdk:21
COPY "./target/proyectosaberprooscar-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8025
ENTRYPOINT [ "java", "-jar", "app.jar" ]