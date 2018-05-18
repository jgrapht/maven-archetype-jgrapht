
# Maven Archetype JGraphT

This is a Maven archetype project for the JGraphT library. 

## Install locally

Assuming this project is at version 1.1.0-SNAPSHOT you can install locally using `mvn install`. Then you can generate a new JGraphT project in batch mode by issuing 

```
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.1.0-SNAPSHOT -DgroupId=org.myorg -DartifactId=myapp -Dversion=0.1.0-SNAPSHOT -B
```

The options can also be given in interactive mode by calling
```
mvn archetype:generate -DarchetypeGroupId=org.jgrapht.archetypes -DarchetypeArtifactId=maven-archetype-jgrapht -DarchetypeVersion=1.1.0-SNAPSHOT 
```

Happy coding!
