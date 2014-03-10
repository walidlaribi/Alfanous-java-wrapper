package Models;

public class Sajda{
	String type; 
	boolean exist;
	int id ;
		 
	public Sajda (String type, boolean exist, int id) {
		this.type = type;
		this.exist = exist;
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean getExist() {
		return exist;
	}
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
