FROM openjdk:8
RUN mvn clean install -Dmaven.test.skip=true
ADD target/docker-springboot-app.jar docker-springboot-app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","docker-springboot-app.jar"]