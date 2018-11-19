FROM openjdk:8
ADD build/libs/mivey-0.0.1-SNAPSHOT.jar mivey.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "mivey.jar"]
