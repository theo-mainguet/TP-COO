package personnages.concret;

import personnages.concret.Arme;
import personnages.abstrait.Combattant;
import personnages.abstrait.Personnage;

public class Guerrier extends Personnage implements Combattant {

	private Arme arme;
	
	public Guerrier(){
		super();
		arme = Arme.values()[ALEA.nextInt(3)];
	}
	public Guerrier(String nom){
		super(nom);
		arme = Arme.values()[ALEA.nextInt(3)];
	}
	public Guerrier(String nom, Arme arme){
		super(nom);
		this.arme = arme;
	}
	
	public String toString(){
		return this.getNom();
	}
	
	public void subitAttaque(Combattant c){
		this.perte(c.getArme().puissance() * this.getForce());
	}
	
	@Override
	public void attaque(Combattant c) {
		System.out.println("guerrier contre guerrier");
		c.subitAttaque(this);
		this.setForce(this.getForce()+1);
		
	}

	@Override
	public Arme getArme() {
		return arme;
	}

}
