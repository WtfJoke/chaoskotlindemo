FROM adoptopenjdk:11-jdk-hotspot
COPY build/libs/chaoskotlin-0.0.1-SNAPSHOT.jar chaos-1.0.0.jar
ENTRYPOINT ["java","-jar","/chaos-1.0.0.jar"]