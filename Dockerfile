FROM maven:3.9.9-eclipse-temurin-21

RUN mkdir job4j_di
WORKDIR /job4j_di
COPY . .
RUN mvn clean package

CMD ["java", "-jar", "target/main.jar"]
