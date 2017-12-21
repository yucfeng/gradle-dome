### sourceSets
This is a java application managed by gradle.
Gradle changes the source project structure with sourceSets.
```groovy
sourceSets {
    main {
        java {
            srcDirs = ['source/main/java']
        }
    }

    test {
        java {
            srcDirs = ['test']
        }
    }
}
```
And we changed the output dir of compiled codes
```groovy
buildDir = 'out'
```

#### Run
Use *gradle build clean* to check dir's change.
Use *gradle runApp* or *gradle run* to run application.
Use *gradle installDist* to install application.

more info: https://docs.gradle.org/current/userguide/application_plugin.html
