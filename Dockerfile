FROM openjdk:11-jdk
COPY ./target/KAJBack-0.0.1-SNAPSHOT.jar KAJBack-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "KAJBack-0.0.1-SNAPSHOT.jar"]
