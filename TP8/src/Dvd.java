import java.util.GregorianCalendar;


public class Dvd extends Document{

	private String producteur;
	private int duree;
	
	public Dvd(){};
	
	public Dvd(String titre, String auteur, GregorianCalendar date, String cote, String producteur, int duree){
		super(titre, auteur, date, cote);
		this.producteur = producteur;
		this.duree = duree;
		super.setEmprunteur(5);
	}
	
	public String getProducteur(){
		return this.producteur;
	}
	
	public int getDuree(){
		return this.duree;
	}
	
	public void setProducteur(String p){
		this.producteur = p;
	}
	
	public void setDuree(int d){
		this.duree = d;
	}
	
	public String toString(){
		return super.toString() + ", Producteur : " + this.producteur + ", Durée (minutes) : " + this.duree;
	}
}
