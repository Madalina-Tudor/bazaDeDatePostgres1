FROM eclipse-temurin:17


VOLUME /tmp

COPY . /app
WORKDIR /app
EXPOSE 8080:8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/Spring-Boot-Docker.jar"]
CMD ["--restart=always"]