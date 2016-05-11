import java.util.GregorianCalendar;


public class Livre extends Document{

	private String editeur;
	private int nbPages;
	
	public Livre(){};
	
	public Livre(String titre, String auteur, GregorianCalendar date, String cote, String editeur, int nbPages){
		super(titre, auteur, date, cote);
		this.editeur = editeur;
		this.nbPages = nbPages;
		super.setDureeEmprunt(15);
	}
	
	public String getEditeur(){
		return this.editeur;
	}
	
	public int getNbPages(){
		return this.nbPages;
	}
	
	public void setEditeur(String e){
		this.editeur = e;
	}
	
	public void setNbPages(int p){
		this.nbPages = p;
	}
	
	public String toString(){
		return super.toString() + ", Editeur : " + this.editeur + ", Nombre de pages : " + this.nbPages;
	}
}
