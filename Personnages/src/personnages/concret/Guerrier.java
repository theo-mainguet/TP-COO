package personnages.concret;
import java.util.Random;

import personnages.abstrait.Combattant;
import personnages.abstrait.Personnage;

public class Guerrier extends Personnage implements Combattant{
	
	Arme arme;
	
	public Guerrier(){
		super();
		Random rd = new Random();
		int numArme = rd.nextInt(3);
		this.arme = Arme.values()[numArme];
	}
	
	public Guerrier (String nom){
		super(nom);
		Random rd = new Random();
		int numArme = rd.nextInt(3);
		this.arme = Arme.values()[numArme];
	}
	
	public Guerrier (String nom, Arme arme){
		super(nom);
		this.arme = arme;
	}
	
	public String toString(){
		return super.toString() + " Arme : " + this.arme;
	}
	
	public void subitAttaque(Combattant combattant){
		if (combattant.getArme() != this.getArme()){
			this.perte(combattant.getArme().puissance() * combattant.getForce());
		}else{
			this.perte(combattant.getForce());
		}
	}

	public void attaque(Combattant combattant) {
		if (this.getArme() == combattant.getArme()){
			combattant.perte(this.getForce());
		}else{
			combattant.perte(this.getArme().puissance() * this.getForce());
		}
		this.setForce(this.getForce() + 1);
	}

	public Arme getArme() {
		return this.arme;
	}
}
