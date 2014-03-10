package org.alfanous.Models;


public class AyaDetail {
	String text;
	PrevNextAya prev_aya;
	PrevNextAya next_aya;
	String recitation;
	String text_no_highlight;
	String translation;
	int id;

	public AyaDetail(String text, PrevNextAya prev_aya, PrevNextAya next_aya, String recitation, String text_no_highlight, String translation, int id) {
		this.text = text;
		this.prev_aya = prev_aya;
		this.next_aya = next_aya;
		this.recitation = recitation;
		this.text_no_highlight = text_no_highlight;
		this.translation = translation;
		this.id = id;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getRecitation() {
		return recitation;
	}
	public void setRecitation(String recitation) {
		this.recitation = recitation;
	}

	public String getTextNoHighlight() {
		return text_no_highlight;
	}
	public void setTextNoHighlight(String text_no_highlight) {
		this.text_no_highlight = text_no_highlight;
	}

	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
