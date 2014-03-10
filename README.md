# Alfanous-java-wrapper
=====================

This is a client library for Java.

It allows you to get results from [Alfanous api](http://www.alfanous.org/jos2) just parsed for you and ready to consume in your java-based app.

We wrote all the models (AyaDetail, AyaItem, Sura, etc.) except few ones that we couldn't know all what do they contain (individual..) and then we wrote the class that parses the JSON and allows you to get results to your queries easily (ElFanousSearch). 

## example usage

```java
ElFanousSearch yourQuery = new ElFanousSearch("here you enter the link of your query");
yourQuery.getError(); // This returns an Error object that we defined in the models.

// You have access to the code and message by doing the following:
>> yourQuery.getError().getCode();
// or
>> yourQuery.getError().getMsg();

// Same thing for the search results, you do the following:
>> yourQuery.getSearchResults().getCount(); // for the number of Ayas in the Ayas object of the api.

>> yourQuery.getSearchResults().getAyaItems().get(index).getAyaDetail().getText(); // to have the Arabic text of the Aya in the "index" position of the search results..
```

## contributing

First install [maven](http://maven.apache.org/), clone this repository and then execute `mvn install` in order to install the project dependencies (we depend on a json library and junit for testing)

### using eclipse

Just install [m2e plugin](https://www.eclipse.org/m2e/) then import the project as a Maven project, or execute
`mvn eclipse:eclipse` to generate an eclipse project (although the repository is already an eclipse project for now :) )

## testing
Run `mvn test` to launch the unit testing using junit (soon)

## generate the JAR file
A Jar file already exists in the `target` folder, you can import it directly in your app. if you want to generate a new updated one:
* using maven: `mvn package`
* using ant: `ant` or `ant jar`

then check the `target` folder

## docs
Running `mvn site` will generate the docs under `target/site`, just open the `index.html` to read it.

