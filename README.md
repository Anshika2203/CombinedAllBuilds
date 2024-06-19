# CombinedAllBuilds

This project demonstrates how to set up a Java project with support for Ant, Maven, and Gradle builds, along with SonarQube integration.

## Project Structure

- **src**: Contains the source code and resources.
- **build.xml**: Ant build script.
- **pom.xml**: Maven build script.
- **build.gradle**: Gradle build script.
- **settings.gradle**: Gradle settings file.
- **sonar-project.properties**: Configuration for SonarQube analysis.

## Building the Project

### Ant
Run the following command from the root directory:
```bash
ant -f build.xml
```

### Maven
Run the following command from the root directory:
```bash
mvn clean install
```
### Gradle
Run the following command from the root directory:
```bash
gradle build
```
### Sonarqube
Run the following command from the root directory:
```bash
sonar-scanner
```
