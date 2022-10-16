
# Basic Fullstack Project

This repo contains a basic example of a fullstack java project.

## How to build and execute the project.

```shell
 $ cd ~/java-fullstack-sample

 # Content of the project.
 $ ls
pom.xml  README.md  src  target

 # Build the project using maven.
 $ mvn package

 # If the build succeeded, there will be a targe directory.
 $ ls target/
classes  fullstackproject-0.0.1-SNAPSHOT.jar  generated-sources

 # Execute the class that contains the main method.
 $ java -cp target/fullstackproject-0.0.1-SNAPSHOT.jar com.fullstack.project.Main
Basic fullstack project

 # Clean the project
 $ mvn clean
```

> For more information about maven see:
> https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html