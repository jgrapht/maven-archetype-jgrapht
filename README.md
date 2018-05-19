
# Maven Archetype JGraphT

This is a Maven archetype project for the [JGraphT](https://github.com/jgrapht/jgrapht) library. 

## Install locally

Assuming this project is at version 1.2.0-SNAPSHOT you can install locally by closing this repository and issuing a `mvn install`. After installing you can generate a new JGraphT project in batch mode by issuing 

```bash
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.2.0-SNAPSHOT -DgroupId=org.myorg -DartifactId=myapp -Dversion=0.1.0-SNAPSHOT -B
```

A folder named `myapp` will be created with a maven project ready for coding. By default we add only the main package dependency which is `jgrapht-core`. If additional functionality is required such as input/output you should edit the generated `pom.xml` and add additional dependencies such as `jgrapht-io`, etc.

The options can also be given in interactive mode by calling
```bash
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.2.0-SNAPSHOT 
```

Happy coding!
