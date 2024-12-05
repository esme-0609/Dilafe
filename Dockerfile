FROM amazoncorretto:17-alpine-jdk
COPY target/Dilafeback-0.0.1-SNAPSHOT.jar dilafeapp.jar
ENTRYPOINT ["java", "-jar", "/dilafeapp.jar"]