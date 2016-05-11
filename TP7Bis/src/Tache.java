
public class Tache implements Prioritaire {
	String intitule;
	int priorite;
	public int getPriorite() {
		return this.priorite;
	}
	
	public Tache(String i, int p){
		this.intitule = i;
		this.priorite = p;
	}
	
	public String toString(){
		return "intitule : " + this.intitule + ", priorite : " + this.priorite;
	}
}
