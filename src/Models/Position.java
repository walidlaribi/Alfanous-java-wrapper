package Models;

public class Position{
	int manzil;
	int rub; 
	int page;
	int page_IN; 
	int ruku; 
	int juz; 
	int hizb;
	
	public Position (int manzil, int rub, int page, int page_IN, int ruku, int juz, int hizb) {
		this.manzil = manzil;
		this.rub = rub;
		this.page = page;
		this.page_IN = page_IN;
		this.ruku = ruku;
		this.juz = juz;
		this.hizb = hizb;
	}
	
	public int getManzil() {
		return manzil;
	}
	public void setManzil(int manzil) {
		this.manzil = manzil;
	}
	
	public int getRub() {
		return rub;
	}
	public void setRub(int rub) {
		this.rub = rub;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPageIN() {
		return page_IN;
	}
	public void setPageIN(int page_IN) {
		this.page_IN = page_IN;
	}
	
	public int getRuku() {
		return ruku;
	}
	public void setRuku(int ruku) {
		this.ruku = ruku;
	}
	
	public int getJuz() {
		return juz;
	}
	public void setJuz(int juz) {
		this.juz = juz;
	}
	
	public int getHizb() {
		return hizb;
	}
	public void setHizb(int hizb) {
		this.hizb = hizb;
	}
}
