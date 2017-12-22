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
Use *gradle runApp* to run application.
Use *gradle installDist* to install application.
Then run the application file 
*./out/install/gradle-application/bin/gradle-application 2001*
Win: *gradle-application.bat 2002*

more info: https://docs.gradle.org/current/userguide/application_plugin.html
