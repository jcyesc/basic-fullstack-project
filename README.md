
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

# How to connect to MariaDb

```shell
 $ mysql -u root  -p

MariaDB [(none)]> show databases;
+------------------------+
| Database               |
+------------------------+
| information_schema     |
| mysql                  |
| people_db              |
| performance_schema     |
+------------------------+
5 rows in set (0.000 sec)

MariaDB [(none)]> use people_db;

Database changed

MariaDB [people_db]> show tables;
+---------------------+
| Tables_in_people_db |
+---------------------+
| country             |
| person              |
+---------------------+
2 rows in set (0.000 sec)
```
