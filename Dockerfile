FROM openjdk:21

WORKDIR /app

COPY target/TodoUILab3-0.0.1-SNAPSHOT.jar todoui.jar

EXPOSE 3040

ENTRYPOINT ["java", "-jar", "/app/todoui.jar"]
