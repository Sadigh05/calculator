FROM openjdk:8-jdk-alpine

ARG JAR_FILE=cible/CalculatorTests.jar
ARG JAR_LIB_FILE=cible/lib/

#cd/usr/local/runme
WORKDIR / usr / local / runme


##copier
 target / find-links.jar /usr/local/rnume/app.jar
#COPIER

$ {JAR_FILE} app.jar

# copier les dependances du projet
cp -rf cible / lib / / usr / local / rnume /lib

#ajouter
$ {JAR_LIB_FILE} lib /


java -jar /usr/local/rnume/app.jar
ENTRYPOINT [ "java" , "-jar" , "app-jar" ]
