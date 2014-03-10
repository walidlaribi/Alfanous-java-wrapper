package org.alfanous.Models;

public class Stat {
	int letters;
	int godnames;
	int words;

	public Stat (int letters, int godnames, int words) {
		this.letters = letters;
		this.godnames = godnames;
		this.words = words;
	}

	public int getLetters() {
		return letters;
	}
	public void setLetters(int letters) {
		this.letters = letters;
	}

	public int getGodnames() {
		return godnames;
	}
	public void setGodnames(int godnames) {
		this.godnames = godnames;
	}

	public int getWords() {
		return words;
	}
	public void setWords(int words) {
		this.words = words;
	}

}
