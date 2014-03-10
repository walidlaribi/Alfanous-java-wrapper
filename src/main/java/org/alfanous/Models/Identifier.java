package org.alfanous.Models;

public class Identifier {
	int sura_id;
	int gid;
	String sura_arabic_name;
    String sura_name;
    int aya_id;

	public Identifier (int sura_id, int gid, String sura_arabic_name, String sura_name, int aya_id) {
		this.gid = gid;
		this.sura_arabic_name = sura_arabic_name;
		this.sura_name = sura_name;
		this.aya_id = aya_id;
	}

	public int getSuraId() {
		return sura_id;
	}
	public void setSuraId(int sura_id) {
		this.sura_id = sura_id;
	}

	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getSuraArabicName() {
		return sura_arabic_name;
	}
	public void setSuraArabicName(String sura_arabic_name) {
		this.sura_arabic_name = sura_arabic_name;
	}

	public String getSuraName() {
		return sura_name;
	}
	public void setSuraName(String sura_name) {
		this.sura_name = sura_name;
	}

	public int getAyaId() {
		return aya_id;
	}
	public void setAyaId(int aya_id) {
		this.aya_id = aya_id;
	}
}
