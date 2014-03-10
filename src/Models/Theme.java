package Models;

public class Theme {
	String chapter;
	String topic;
	String subtopic;
	
	public Theme(String chapter, String topic, String subtopic) {
		this.chapter = chapter;
		this.topic = topic;
		this.subtopic = subtopic;
	}
	
	public String getChapter() {
		return chapter;
	}
	
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getSubtopic() {
		return subtopic;
	}
	
	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}
}
