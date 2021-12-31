FROM openjdk:14-ea-12-jdk-alpine
EXPOSE 8080
ADD REST/target/demo-0.0.1-SNAPSHOT.jar /myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]