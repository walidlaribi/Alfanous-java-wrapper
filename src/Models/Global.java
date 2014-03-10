package Models;

public class Global {	
	int nb_matches;
	int nb_vocalizations; 
	int nb_words;
	
	public Global(int nb_matches, int nb_vocalizations, int nb_words) {
		this.nb_matches = nb_matches;
		this.nb_vocalizations = nb_vocalizations;
		this.nb_words = nb_words;
	}
	
	public int getNbMatches() {
		return nb_matches;
	}
	public void setNbMatches(int nb_matches) {
		this.nb_matches = nb_matches;
	}
	
	public int getNbVocalizations() {
		return nb_vocalizations;
	}
	public void setNbVocalizations(int nb_vocalizations) {
		this.nb_vocalizations = nb_vocalizations;
	}
	
	public int getNbWords() {
		return nb_words;
	}
	public void setNbWords(int nb_words) {
		this.nb_words = nb_words;
	}
}
