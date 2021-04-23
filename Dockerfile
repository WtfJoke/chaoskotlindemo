FROM adoptopenjdk:11-jdk-hotspot
COPY build/libs/chaoskotlin-0.0.1-SNAPSHOT.jar chaos-1.0.0.jar
COPY chaos-monkey-spring-boot-2.3.10-jar-with-dependencies.jar .
COPY runChaosDocker.sh /runChaos.sh
RUN chmod +x /runChaos.sh
ENTRYPOINT ["/runChaos.sh"]