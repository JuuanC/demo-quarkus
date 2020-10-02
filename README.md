# demo-crum project

# Optum Pathway CCM Developer Case Study


The only thing better than a Maven archetype is a repo you can fork with everything already setup. Skip the documentation and just fork-and-code.

Delete the sample code, replace with your own and you’re good to go.

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit
* 	[Quarkus](https://quarkus.io/) - Framework to ease the bootstrapping and development of new Quarkus Applications
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[OpenAPI](https://swagger.io/specification/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
* 	[JUnit](https://junit.org/) - Testing framework for Java
* 	[mockito](https://swagger.io/specification/) - Mocking framework for unit tests in Java.
*   [JWT](https://jwt.io/) - JSon Web Tokens Library for token Singing/Verification


## External Tools Used

* 	[Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## To-Do

* 	[x] Create Quarkus project
*   [x] CRUD accounts, hospitals and institutions on Postgresql
* 	[x] Retrieve accounts, hospital and institutions
* 	[x] Log in anf log out
* 	[x] Use JWT for authorization and antentication

## Running the application locally

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `demo-crum-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/demo-crum-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/demo-crum-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

### PostgreSQL database 

database structure

|Account    |
|id_account | name | password | rfc | username |

Note.- All the information is on the 'application.yml'


### Testing on postman



### Web Page URLs

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080/save`       | POST |
|`http://localhost:8080/user/1`         | GET |
|`http://localhost:8080/all` | GET |

to save one user with the 'POST' operation please use the following on the body, select `raw` radio button and `JSON` from the dropdown menu at the left

```
{
    "firstName" : "John",
    "middleInitial": "D",
    "lastName": "Doe",
    "city":"Minneapolis",
    "state" : "MN",
    "zipCode": "55444",
    "phoneNumber" : "999-999-999"
}

IMPORTANT.- The fields `firstName, lastName` CAN'T be nulls
```

I have added 10 dummy users to the DB on the `data.sql` file under `resources` directory, and is recreated every time you restart the service, so if you add a user with the `POST` operation it will get the id 11.

###Package structure

## Files and Directories

```text
.
├── Sample_Optum
├── src
│   └── main
│       └── java
│           ├── com.optum.optumsample.controller
│           ├── com.optum.optumsample.exception
│           ├── com.optum.optumsample.model
│           ├── com.optum.optumsample.controller
│           ├── com.optum.optumsample.persistence
│           └── com.optum.optumsample.service
│           
├── src
│   └── main
│       └── resources
│           ├── static
│           ├── templates
│           │   └── view.html
│           └── application.yml
│           
├── src
│   └── test
│       └── java
│           └── com.optum.optumsample
│               ├── com.optum.optumsample.controller
│               └── com.optum.optumsample.service
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## packages

* 	`controllers` — to listen to the client;
* 	`exception` — to handle the exceptions;
* 	`models` — to hold our entities;
* 	`persistence` — to communicate with the database;
* 	`services` — to hold our business logic;
* 	`resources/` - Contains all the static resources, templates and property files.
* 	`resources/application.yml` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.
* 	`test/` - contains unit and integration tests
* 	`pom.xml` - contains all the project dependencies