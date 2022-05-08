## Example JASM Gradle project

This is an example of using the JASM assembler and gradle plugin. 
There's not much here currently but it will be fleshed out as things develop.

To use this, you'll (currently) need to have both JASM and the gradle plugin
pushed to your local Maven repository (as it's too early in the development
cycle to actually release any of this to Maven Central or the Gradle plugin repo).

See [The Gradle Plugin README](https://github.com/roscopeco/jasm-gradle-plugin/blob/main/README.md)
for details on how to get started. Once you've followed the instructions there,
you should be able to build this project with:

```
./gradlew build
```

Note that JASM requires Java 17 or above - it will not work with lower versions.

### Who?

JASM is copyright 2022 Ross Bamford (roscopeco AT gmail DOT com). 

See LICENSE.md for the gory legal stuff (spoiler: MIT).

