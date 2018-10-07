# Libraries and Gradle
Don't reinvent the wheel. Instead, use libraries that others have written.

## JAR libraries
>>> download JAR library
>>> Intellij > project structure
>>> project structure > libraries

Testing the library
```java
package io.github.perrymant.moneymaker;

        import com.jakewharton.fliptables.FlipTableConverters;
        import org.junit.Test;

        import java.util.List;

public class FlipTableTest {
    @Test
    public void test_1() {

        List<Transaction> people = new TransactionMaker().getTransactions();
        System.out.println(FlipTableConverters.fromIterable(people, Transaction.class));
    }
}
```

# Gradle
Gradle is an open source build automation tool used by Java developers to define and organize the build process.
It builds the deployment artifacts (any file used such as: Java source code, Java byte code, XML files, graphic and audio files, etc.), and it manages dependencies (often open-source Java libraries that somebody else has created).

Basically build automation is the act of scripting or automating a wide variety of tasks that software developers do in their day-to-day activities like:
- Downloading dependencies.
- Compiling source code into binary code.
- Packaging that binary code.
- Running tests.
- Deployment to production systems.

Build tools are programs that automate the creation of executable applications from source code(eg. .apk for android app).
Building incorporates compiling,linking and packaging the code into a usable or executable form.

Wheras previous build tools (Ant, Maven) were written in XML - Gradle is written in the Groovy programming language.

## To initialise a Gradle project
Spring Initializr (https://start.spring.io/) & Mavencentral (https://search.maven.org/)
1. Spring Initializr:
    This downloads a gradle project with the following structure (note the mirrored /main and /test directory structure):

├── build
│   └── ...
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── moneymaker.iml
├── out
│   └── ...
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── io
    │   │       └── github
    │   │           └── perrymant
    │   │               └── moneymaker
    │   │                   ├── Balance.java
    │   │                   ├── Budget.java
    │   │                   ├── Logger.java
    │   │                   ├── Moneymaker.java
    │   │                   ├── ReportLine.java
    │   │                   ├── Transaction.java
    │   │                   ├── TransactionMaker.java
    │   │                   └── TransactionType.java
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── io
                └── github
                    └── perrymant
                        └── moneymaker
                            ├── BalanceTest.java
                            ├── BudgetTest.java
                            ├── FlipTableTest.java
                            └── ReportLineTest.java

2. Mavencentral:
    A repository of libraries. This is where you should go to find libraries, and find the build info can be found which needs to be added to the `build.gradle` file.

`build.gradle` -> this is the file where you update the dependencies, you can also put ".gradle" in the .gitignore file.

### Commands for gradle
`gradle build` = ./gradlew <clean/build/test>
`clean` - Deletes the build directory.
`./gradlew test` - Runs the unit tests. (also builds) - good to check the build status.
`./gradlew tasks` - get a list of all the possible gradle tasks I can run for this project (not that many)
`build` - builds

### Travis CI
Continuous Integration is the practice of merging in small code changes frequently - rather than merging in a large change at the end of a development cycle.

### Steps to include a Github Status badge:
1. activate the repo via travis profile @ https://travis-ci.org/
1. create .Travis.yml file in project and added:
    ```
    language: java
    jdk:
      - oraclejdk8
    ```
1. git add, commit & push.
1. check all is well in travis
1. Badge on travis page or also on https://shields.io/ for badge
