### Run Wep-app with Gretty plugin
more info: *http://akhikhl.github.io/gretty-doc/index.html*

#### apply plugin
```groovy
apply from: 'https://raw.github.com/akhikhl/gretty/master/pluginScripts/gretty.plugin'
```
or
```groovy
buildscript {
  repositories {
    jcenter()
    // enable this to use snapshot versions of Gretty:
    // maven { url 'http://oss.jfrog.org/artifactory/oss-snapshot-local' }
  }

  dependencies {
    classpath 'org.akhikhl.gretty:gretty:+'
  }
}
apply plugin: 'org.akhikhl.gretty'
``` 

PS: Gretty cannot work with JDK 9 now.