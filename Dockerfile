FROM openjdk:17


VOLUME /tmp

COPY . /app
WORKDIR /app
EXPOSE 5432:5432

ENTRYPOINT ["java","-jar","target/Spring-Boot-Docker.jar"]
CMD ["--restart=always"]