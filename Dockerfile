FROM bellsoft/liberica-openjdk-alpine:21
LABEL authors="JAGO industries"
#CMD ["mvn spring-boot:build-image"]
#COPY /.mvn/maven-wrapper.jar maven-wrapper.jar
#COPY mvnw.cmd mvnw.cmd
WORKDIR vju
#Can also be commended out for a real db
COPY  src/main/resources/__files /vju/resources/__files
COPY  target/*.jar /vju/sif-vju-backend.jar

ENTRYPOINT ["java", "-jar", "/vju/sif-vju-backend.jar"]