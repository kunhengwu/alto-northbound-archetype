this is maven archetype for alto-standard-northbound-route

You can create a northbound-route template following under command
```Bash
mvn archetype:generate 
-DarchetypeGroupId=alto-northbound \
-DarchetypeArtifactId=alto-northbound-archetype 
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DarchetypeRepository=local 
[-Dversion=0.2.0-SNAPSHOT][-DclassPrefix=<your className>]
```
The "-DarchetypeVersion" is the archetype version.
The "-DarchetypeRepository=local" can reduce the time which be taken in creating project.
The "-Dversion" is the snapshot version of your project and it is optional and its default value is 0.2.0-SNAPSHOT.
The "-DclassPrefix" can help you custom your class name.









