FROM openjdk:11

ADD ./target/Muzix-MongoDb-0.0.1-SNAPSHOT.jar Muzix-MongoDb-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Muzix-MongoDb-0.0.1-SNAPSHOT.jar"]

