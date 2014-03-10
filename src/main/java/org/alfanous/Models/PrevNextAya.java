package org.alfanous.Models;

public class PrevNextAya {
	String text;
	int id;
	String sura_arabic;
	String sura;

	public PrevNextAya(String text, int id, String sura_arabic, String sura) {
		this.text = text;
		this.id = id;
		this.sura_arabic = sura_arabic;
		this.sura = sura;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getSuraArabic() {
		return this.sura_arabic;
	}
	public void setSuraArabic(String sura_arabic) {
		this.sura_arabic = sura_arabic;
	}

	public String getSura() {
		return this.sura;
	}
	public void setSura(String sura) {
		this.sura = sura;
	}
}
