
# Maven Archetype JGraphT

This is a Maven archetype project for the [JGraphT](https://github.com/jgrapht/jgrapht) library. Latest
version is `1.2.0`.

## How to use

### From the command line (interactively)

Install Maven 3 and run the following, providing all necessary information when prompted.

```bash
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.2.0
```

A folder named `myapp` will be created with a maven project ready for coding. By default we add only the main package dependency which is `jgrapht-core`. If additional functionality is required such as input/output you should edit the generated `pom.xml` and add additional dependencies such as `jgrapht-io`, etc.

### From the command line (batch mode)

Run 

```bash
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.2.0 -DgroupId=org.myorg -DartifactId=myapp -Dversion=0.1.0-SNAPSHOT -B
```

replacing with your own groupId, artifactId and version.

### From Eclipse 

You can add a new Maven Remote Archetype catalog using [archetype-catalog.xml](https://raw.githubusercontent.com/jgrapht/maven-archetype-jgrapht/master/archetype-catalog.xml) or 
you can use the `Add Archetype` functionality and provide the above version details.



Happy coding!
