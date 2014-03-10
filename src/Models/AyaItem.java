package Models;

public class AyaItem {
	Theme theme;
	Sura sura;
	Sajda sajda;
	Position position;
	Identifier identifier;
	AyaDetail aya;
	Stat stat;
	
	public AyaItem(Theme theme, Sura sura, Sajda sajda, Position position, Identifier identifier, AyaDetail aya, Stat stat) {
		this.theme = theme;
		this.sura = sura;
		this.sajda = sajda;
		this.position = position;
		this.identifier = identifier;
		this.aya = aya;
		this.stat = stat;
	}
	
	public Theme getTheme() {
		return this.theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	
	public Sura getSura() {
		return this.sura;
	}
	public void setSura(Sura sura) {
		this.sura = sura;
	}
	
	public Sajda getSajda() {
		return this.sajda;
	}
	public void setSajda(Sajda sajda) {
		this.sajda = sajda;
	}
	
	public Position getPosition() {
		return this.position;
	}
	public void setPotition(Position position) {
		this.position = position;
	}
	
	public Identifier getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}
	
	public AyaDetail getAyaDetail() {
		return this.aya;
	}
	public void setAyaDetail(AyaDetail aya) {
		this.aya = aya;
	}
	
	public Stat getStat() {
		return this.stat;
	}
	public void setStat(Stat stat) {
		this.stat = stat;
	}
}
