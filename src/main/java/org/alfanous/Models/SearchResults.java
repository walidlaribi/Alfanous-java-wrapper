package org.alfanous.Models;
import java.util.ArrayList;


public class SearchResults {
	ArrayList<AyaItem> ayas;
	double runtime;
	Words words;
	Interval interval;

	public SearchResults(ArrayList<AyaItem> ayas, double runtime, Words words, Interval interval) {
		this.ayas = ayas;
		this.runtime = runtime;
		this.words = words;
		this.interval = interval;
	}

	public ArrayList<AyaItem> getAyaItems() {
		return this.ayas;
	}
	public void setAyaItems(ArrayList<AyaItem> ayas) {
		this.ayas = ayas;
	}

	public double getRuntime() {
		return runtime;
	}
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}

	public Words getWords() {
		return this.words;
	}
	public void setWords(Words words) {
		this.words = words;
	}

	public Interval getInterval() {
		return this.interval;
	}
	public void setInterval(Interval interval) {
		this.interval = interval;
	}

	public int getCount() {
		return this.ayas.size();
	}
}
