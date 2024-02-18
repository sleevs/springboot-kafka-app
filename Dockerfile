FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
WORKDIR /root/
COPY --from=builder /usr/src/target/springboot-kafka-app.jar .
ENTRYPOINT ["java","-jar","/app.jar"]
