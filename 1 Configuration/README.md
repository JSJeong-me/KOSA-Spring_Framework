### Spring 시작하기

https://spring.io/quickstart

https://start.spring.io/

### Spring 구동 환경 설정

    Java 11 ->  Java SE Development Kit 11 Downloads
    
    https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
    
    JAVA_HOME 환경변수 설정 C:\Program Files\Java\jdk-11.0.12
    
    (참조: https://marobiana.tistory.com/163)
    

    Maven Project  ->  Downloading Apache Maven 3.8.2
    
    https://maven.apache.org/download.cgi
    
    C:\Users\user\.m2
    
    
    
   ### Add your code
    
    https://gist.github.com/JSJeong-me/4e629a8c7cb383237d9584526265b3b2

   ### Try it
   
       >cd demo

       >mvnw spring-boot:run


  ### Working a Getting Started guide with STS
  
    https://spring.io/tools




  ### 메이븐 설치하기

    https://maven.apache.org/install.html
    
    unzip apache-maven-3.8.2-bin.zip
    
    
  ### Check environment variable value e.g.
 
        echo %JAVA_HOME% 
        C:\Program Files\Java\jdk-11.0.12
        
      
  ### Maven in 5 Minutes
  
    https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html#
    
    >mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    
    The src/main/java directory contains the project source code, the src/test/java directory contains the test source, and the pom.xml file is the project's Project Object Model, or POM.
    
  ### The POM
  
      The pom.xml file is the core of a project's configuration in Maven. It is a single configuration file that contains the majority of information required to build a project in just the way you want. The POM is huge and can be daunting in its complexity, but it is not necessary to understand all of the intricacies just yet to use it effectively.
  
  ### Build the Project
  
    >mvn package
    >java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
    >mvn help:describe -Dcmd=compile
    
  ### Introduction to the Build Lifecycle
  
      https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
      
        Maven Phases
        Although hardly a comprehensive list, these are the most common default lifecycle phases executed.

        validate: validate the project is correct and all necessary information is available
        compile: compile the source code of the project
        test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
        package: take the compiled code and package it in its distributable format, such as a JAR.
        integration-test: process and deploy the package if necessary into an environment where integration tests can be run
        verify: run any checks to verify the package is valid and meets quality criteria
        install: install the package into the local repository, for use as a dependency in other projects locally
        deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.
        There are two other Maven lifecycles of note beyond the default list above. They are

        clean: cleans up artifacts created by prior builds
        
        >mvn clean dependency:copy-dependencies package
        
        site: generates site documentation for this project
  
        >mvn site
  
  ### Maven’s Objectives
  
        Making the build process easy
        Providing a uniform build system
        Providing quality project information
        Encouraging better development practices
        
   ### Maven Getting Started Guide
   
        https://maven.apache.org/guides/getting-started/index.html
        

