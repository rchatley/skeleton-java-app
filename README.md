# Skeleton NodeJS app

A skeleton Java web app with no web framework.

## Create Your Own Fork

Fork this project to create a repo under your own GitHub account, so that you can commit and push to it.
Then clone the code from your fork onto your machine.


## Install Dependencies

Make sure you have a JDK and a Java IDE installed. The skeleton web app is configured as a Maven project,
so if you import it in to an IDE (e.g. IntelliJ IDEA) as a Maven project then it should download any
dependencies as necessary.


## Running Locally

If you open the project in an IDE, you should find a class called `WebServer` which has a `main` method.
If you run this main method then the web server should start up on your local machine.


Your app should now be running on http://localhost:5000.

Now try the following request in your browser: http://localhost:5000/api?q=Who%20wrote%20Romeo%20and%20Juliet?
This should call the code in `QueryProcessor.java`.

## Run the unit tests

The skeleton app comes with a small set of unit tests (see the file `QueryProcessorTest`), which you can add to as you 
add functionality. Run the tests using jUnit in your IDE, or from the terminal using Maven.

```sh
$ cd skeleton-java-app
$ mvn test
```

