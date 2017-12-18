This is a simple webapp. We can run this webapp in Jetty.
> In gradle 4+ we can use Gretty plugin.
> In gradle 4- we can use Jetty plugin.

### Run Wep-app with Gretty plugin
more info: *http://akhikhl.github.io/gretty-doc/index.html*

#### Apply plugin
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

#### Run
command: *gradle appRun*

PS: Gretty cannot work with JDK 9 now.