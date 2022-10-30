FROM openjdk:8-jdk-alpine
EXPOSE 8083
ARG JAR_FILE=/1.0-SNAPSHOT/*.jar
RUN curl -u admin:amine -o achat.jar "http://192.168.33.10:8080/repositories/maven-snapshots/com/esprit/examen/tpAchatProject/1.0-SNAPSHOT/tpAchatProject-1.0-20221018.011802-15.jar" -L
ENTRYPOINT ["java","-jar","/achat.jar"]
ENTRYPOINT ["java","-jar","/docker-spring-boot.war"]