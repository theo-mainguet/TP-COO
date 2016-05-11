package personnages.abstrait;

import personnages.affichage.Parametres;

public abstract class Personnage implements Vivant{
	private String nom;
	private int vie;
	private int force;
	private static int nbPersonnages = 0;
	private int numeroPersonnage;
	
	public Personnage(){
		this.nom = "Sans Nom";
		this.force = Parametres.getForce();
		this.vie = Parametres.getVie();
		nbPersonnages ++;
		this.numeroPersonnage = numeroPersonnage;
	}
	
	public Personnage(String nom){
		this.nom = nom;
		this.force = 10;
		this.vie = 100;
		this.nbPersonnages ++;
		int tmp = this.nbPersonnages;
		this.numeroPersonnage = tmp;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getVie(){
		return this.vie;
	}
	
	public int getForce(){
		return this.force;
	}
	
	public void setForce(int force){
		this.force = force;
	}
	
	public void perte(int degat){
		this.vie -= degat;
	}
	
	public boolean estVivant(){
		return this.vie > 0;
	}
	
	public void attaque (Vivant vivant){
		vivant.subitAttaque(this);
		this.force++;
	}
	
	public void subitAttaque(Vivant vivant){
		this.vie -= vivant.getForce();
	}
	
	public String toString(){
		return "Nom : " + this.nom + " Vie : " + this.vie + " Force : " + this.force;
	}
}
