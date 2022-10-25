FROM openjdk:17
EXPOSE 8080
ADD target//springboot-mongo-atlas-main.jar springboot-mongo-atlas-main.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-atlas-main.jar"]