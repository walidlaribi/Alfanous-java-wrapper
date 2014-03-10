Alfanous-java-wrapper
=====================

This is a client library for Java.

It allows you to get results from al fanous api just parsed for you and ready to use in your next java-based app.

We wrote all the models (AyaDetail, AyaItem, Sura, etc.) except few ones that we couldn't know all what do they contain (individual..) and then we wrote the class that parses the json and allows you to get results to your queries easily (ElFanousSearch). For exampel you do the following:

ElFanousSearch yourQuery = new ElFanousSearch("here you enter the link of your query");
yourQuery.getError();
This returns an Error object that we defined in the models, you have access to the code and message by doing the following:

yourQuery.getError().getCode();
or

yourQuery.getError().getMsg();
Same thing for the search results, you do the following:

yourQuery.getSearchResults().getCount(); // for the number of ayas in the ayas object of the api.
yourQuery.getSearchResults().getAyaItems().get(index).getAyaDetail().getText(); // to have the arabic text of the aya in the "index" position of the search results..
