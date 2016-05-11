

public class Poste extends Assemblage{
	
	private String nom;
	
	public Poste(){
		this.nom = "";
	}
	
	public Poste (String nom){
		this.nom = nom;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String toString(){
		return "Nom du poste : " + this.nom + "\n" + super.toString();
	}
}
