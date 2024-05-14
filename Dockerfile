# Utilisez une image de base, par exemple une image Alpine Linux
FROM openjdk:21-jdk-slim

# Définissez l'auteur du fichier (facultatif)
LABEL maintainer="mai mbacke maimb98@gmail.com>"

EXPOSE 8080

ADD  target/githubaction-0.0.1-SNAPSHOT.jar githubaction.jar

ENTRYPOINT ["java","-jar", "githubaction.jar"]
