package org.alfanous.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONObject;
import org.alfanous.Models.*;

public class AlFanousSearch {
	StatusMessage error;
	SearchResults search;

	public AlFanousSearch(String url) throws Exception {

		JSONObject globalResultJSON = new JSONObject(readUrl(url));
	    /**********Error*************************/
	    JSONObject errorJSON = globalResultJSON.getJSONObject("error");
	    StatusMessage resultsError = new StatusMessage(errorJSON.getString("msg"), errorJSON.getInt("code"));
	    this.error = resultsError;

	    /************Search***********************/
	    JSONObject searchJSON = globalResultJSON.getJSONObject("search");
	    ArrayList<AyaItem> ayaItems = new ArrayList<AyaItem>();

	    JSONObject ayasJSON =  searchJSON.getJSONObject("ayas");
	    for (int i = 1; i <= ayasJSON.length(); i++) {
	    	JSONObject ayaJSON = ayasJSON.getJSONObject(""+i);

	    	//*****************Getting the theme *****************//
	    	JSONObject themeJSON = ayaJSON.getJSONObject("theme");
	    	String chapter = themeJSON.get("chapter").toString();
	    	String topic = themeJSON.get("topic").toString();
	    	String subtopic = themeJSON.get("subtopic").toString();
	    	Theme ayaTheme = new Theme(chapter, topic, subtopic);

	    	//********************Getting the sura***************//
	    	JSONObject suraJSON = ayaJSON.getJSONObject("sura");
	    	String name = suraJSON.getString("name");
	    	String english_name = suraJSON.getString("english_name");
	    	String arabic_type = suraJSON.getString("arabic_type");
	    	int ayas = suraJSON.getInt("ayas");
	    	int order = suraJSON.getInt("order");
	    	String suraType = suraJSON.getString("type");
	    	int id = suraJSON.getInt("id");
	    	String arabic_name = suraJSON.getString("arabic_name");
	    	Sura ayaSura = new Sura(name, english_name, arabic_type, ayas, order, suraType, id, arabic_name);

	    	//********************Getting the sajda***************//
	    	JSONObject sajdaJSON = ayaJSON.getJSONObject("sajda");
	    	//String sajdaType = sajdaJSON.getString("type");
	    	boolean sajdaExist = sajdaJSON.getBoolean("exist");
	    	//int sajdaId = sajdaJSON.getInt("id");
	    	Sajda ayaSajda = new Sajda(null, sajdaExist, 0);

	    	//******************Getting the position***************//
	    	JSONObject positionJSON = ayaJSON.getJSONObject("position");
	    	int manzil = positionJSON.getInt("manzil");
	    	int rub = positionJSON.getInt("rub");
	    	int page = positionJSON.getInt("page");
	    	int page_IN = positionJSON.getInt("page_IN");
	    	int ruku = positionJSON.getInt("ruku");
	    	int juz = positionJSON.getInt("juz");
	    	int hizb = positionJSON.getInt("hizb");
	    	Position ayaPosition = new Position(manzil, rub, page, page_IN, ruku, juz, hizb);

	    	//******************Getting the identifier***************//
	    	JSONObject identifierJSON = ayaJSON.getJSONObject("identifier");
	    	int sura_id = identifierJSON.getInt("sura_id");
	    	int gid = identifierJSON.getInt("gid");
	    	String sura_arabic_name = identifierJSON.getString("sura_arabic_name");
	        String sura_name = identifierJSON.getString("sura_arabic_name");
	        int aya_id = identifierJSON.getInt("aya_id");
	        Identifier ayaIdentifier = new Identifier(sura_id, gid, sura_arabic_name, sura_name, aya_id);

	        //******************Getting the aya***************//
	        JSONObject ayaDetailJSON = ayaJSON.getJSONObject("aya");
	        String ayaText = ayaDetailJSON.getString("text");
	        JSONObject prevAyaJSON = ayaDetailJSON.getJSONObject("prev_aya");
	        String textPrevAya = prevAyaJSON.getString("text");
	    	int idPrevAya = prevAyaJSON.getInt("id");
	    	String sura_arabicPrev = prevAyaJSON.getString("sura_arabic");
	    	String suraPrev = prevAyaJSON.getString("sura");
	    	PrevNextAya prevAya = new PrevNextAya(textPrevAya, idPrevAya, sura_arabicPrev, suraPrev);
	    	JSONObject nextAyaJSON = ayaDetailJSON.getJSONObject("next_aya");
	        String textNextAya = nextAyaJSON.getString("text");
	    	int idNextAya = nextAyaJSON.getInt("id");
	    	String sura_arabicNext = nextAyaJSON.getString("sura_arabic");
	    	String suraNext = nextAyaJSON.getString("sura");
	    	PrevNextAya nextAya = new PrevNextAya(textNextAya, idNextAya, sura_arabicNext, suraNext);
	    	String recitation = ayaDetailJSON.getString("recitation");
	    	String text_no_highlight = ayaDetailJSON.getString("text_no_highlight");
	    	//String translation = ayaDetailJSON.getString("translation");
	    	int ayaId = ayaDetailJSON.getInt("id");
	    	AyaDetail ayaDetail = new AyaDetail(ayaText, prevAya, nextAya, recitation, text_no_highlight, null, ayaId);

	    	//******************Getting the stat***************//
	    	JSONObject ayaStatJSON = ayaJSON.getJSONObject("stat");
	    	int letters = ayaStatJSON.getInt("letters");
	    	int godnames = ayaStatJSON.getInt("godnames");
	    	int words = ayaStatJSON.getInt("words");
	    	Stat ayaStat = new Stat(letters, godnames, words);

	    	AyaItem ayaItem = new AyaItem(ayaTheme, ayaSura, ayaSajda, ayaPosition, ayaIdentifier, ayaDetail, ayaStat);
	    	ayaItems.add(ayaItem);
		}

	    //******************Getting the stat***************//
	    double runtime = searchJSON.getDouble("runtime");

	    //******************Getting the words***************//
	    JSONObject wordsJSON = searchJSON.getJSONObject("words");
	    JSONObject globalJSON = wordsJSON.getJSONObject("global");
	    int nb_matches = globalJSON.getInt("nb_matches");
		int nb_vocalizations = globalJSON.getInt("nb_vocalizations");
		int nb_words = globalJSON.getInt("nb_words");
		Words words = new Words(new Global(nb_matches, nb_vocalizations, nb_words));

		//******************Getting the interval***************//
		JSONObject intervalJSON = searchJSON.getJSONObject("interval");
		int start = intervalJSON.getInt("start");
		int total = intervalJSON.getInt("total");
		int end = intervalJSON.getInt("end");
		int page = intervalJSON.getInt("page");
		int nb_page = intervalJSON.getInt("nb_pages");
		Interval interval = new Interval(start, total, end, page, nb_page);

		SearchResults searchItems = new SearchResults(ayaItems, runtime, words, interval);
		this.search = searchItems;
	}

	public StatusMessage getError() {
		return this.error;
	}
	public SearchResults getSearchResults() {
		return this.search;
	}

	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read);

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
}