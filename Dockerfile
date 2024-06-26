FROM openjdk:17

EXPOSE 8080

ADD target/PARK-0.0.1-SNAPSHOT.jar PARK-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","/PARK-0.0.1-SNAPSHOT.jar" ]
