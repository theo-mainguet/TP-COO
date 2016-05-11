import java.util.Calendar;
import java.util.GregorianCalendar;


public class Document {
	
	private String titre;
	private String auteur;
	private GregorianCalendar date;
	private String cote;
	private int emprunteur;
	private int dureeEmprunt;
	private GregorianCalendar dateEmprunt;
	
	public Document(){this.emprunteur = -1;};
	
	public Document (String t, String a, GregorianCalendar d, String c){
		this.titre = t;
		this.auteur = a;
		this.date = d;
		this.cote = c;
		this.emprunteur = -1;
	}
	
	public int getDureeEmprunt(){
		return this.dureeEmprunt;
	}
	
	public void setDureeEmprunt(int n){
		this.dureeEmprunt = n;
	}
	
	public String getTitre(){
		return this.titre;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
	
	public GregorianCalendar getDate(){
		return this.date;
	}
	
	public String getCote(){
		return this.cote;
	}
	
	public int getEmprunteur(){
		return this.emprunteur;
	}
	
	public void setEmprunteur(int n){
		this.emprunteur = n;
	}
	
	public GregorianCalendar dateRetour(){
		GregorianCalendar res = dateEmprunt;
		res.setTimeInMillis(this.dateEmprunt.getTimeInMillis() + (dureeEmprunt * 24 * 3600 * 100));
		return res;		
	}
	
	public boolean equals(){
		return this.titre.equals(titre) && this.auteur.equals(auteur) && this.date.equals(date) && this.cote.equals(cote);
	}
	
	public boolean aPourCote(String cote){
		return this.cote.equals(cote);
	}
	
	public boolean emprunt(int emprunteur){
		boolean res;
		if (emprunteur < 0){
			res = true;
		}else{
			res = false;
		}
		if (res){
			this.emprunteur = emprunteur;
			this.dateEmprunt = new GregorianCalendar();
			return res;
		}else{
			return false;
		}
	}
	
	public boolean restitution(){
		if (this.emprunteur < 0){
			return false;
		}else{
			this.emprunteur = -1;
			this.dateEmprunt = null;
			return true;
		}
	}
	
	public boolean estLibre(){
		return this.emprunteur < 0;
	}
	
	public String toString(){
		return "Titre : " + this.titre + ", Auteur : " + this.auteur + ", Date : " + this.date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH) +"/"+date.get(Calendar.YEAR) + ", Cote : " + this.cote;
	}
}
