java -cp ./build/libs/chaoskotlin-0.0.1-SNAPSHOT.jar -Dlogging.level.de.codecentric.spring.boot.chaos.monkey=DEBUG -Dloader.path=chaos-monkey-spring-boot-2.3.10-jar-with-dependencies.jar org.springframework.boot.loader.PropertiesLauncher --spring.profiles.active=chaos-monkey