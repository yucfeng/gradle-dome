This project depends many dependencies.
> Learn how to build a repository and get dependencies.

## Dependency 
Apply gradle wrapper in your own env. <BR>
Run *gradle wrapper*.

Get Dependencies from maven repository.<BR>
Run *gradle downloadJars*. <BR>

Get Dependencies from personal artifactory repository.<BR>
Run *gradle copyDependencies*. 

Build project.<BR>
*gradle build*

Run this application. <BR>
*gradle runApp*

Clean all dependencies. <BR>
*gradle cleanDependencies*

## About Artifactory 

I build a local Artifactory Repository, <BR>
then publish  or download artifactories from it. <BR>

more info: *https://www.jfrog.com/confluence/display/RTF*

### Publish
gradle publish

### Download
gradle copyDependencies
