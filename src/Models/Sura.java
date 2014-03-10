package Models;

public class Sura {
	String name; 
	String english_name;
    String arabic_type; 
    int ayas; 
    int order; 
    String type; 
    int id; 
    String arabic_name;
    
	public Sura(String name, String english_name, String arabic_type, int ayas, int order, String type, int id, String arabic_name) {
		this.name = name;
		this.english_name = english_name;
		this.arabic_type = arabic_type;
		this.ayas = ayas;
		this.order = order;
		this.type = type;
		this.id = id;
		this.arabic_name = arabic_name;
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEnglishName() {
		return english_name;
	}
	public void setEnglishName(String english_name) {
		this.english_name = english_name;
	}
	
	public String getArabicType() {
		return arabic_type;
	}
	public void setArabicType(String arabic_type) {
		this.arabic_type = arabic_type;
	}
	
	public int getAyas() {
		return ayas;
	}
	public void setAyas(int ayas) {
		this.ayas = ayas;
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getArabicName() {
		return arabic_name;
	}
	public void setArabicName(String arabic_name) {
		this.arabic_name = arabic_name;
	}
}
