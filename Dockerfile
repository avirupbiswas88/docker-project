FROM openjdk:8
ADD target/docker-springboot-app.jar docker-springboot-app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","docker-springboot-app.jar"]