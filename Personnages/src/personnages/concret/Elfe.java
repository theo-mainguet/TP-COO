package personnages.concret;
import java.util.Random;

import personnages.abstrait.Combattant;
import personnages.abstrait.Magicien;
import personnages.abstrait.Personnage;
import personnages.abstrait.Vivant;

public class Elfe extends Personnage implements Combattant{

	private boolean estGuerrier = false;
	private Element element;
	private Arme arme;
	
	public Elfe(){
		super();
		Random rd = new Random();
		int numElement = rd.nextInt(4);
		int numArme = rd.nextInt(3);
		this.element = Element.values()[numElement];
		this.arme = Arme.values()[numArme];
	}
	
	public Elfe(String nom){
		super(nom);
		Random rd = new Random();
		int numElement = rd.nextInt(4);
		int numArme = rd.nextInt(3);
		this.element = Element.values()[numElement];
		this.arme = Arme.values()[numArme];
	}
	
	public Elfe(String nom, Arme arme, Element element){
		super(nom);
		this.element = element;
		this.arme = arme;
	}
	
	public String toString(){
		return super.toString() + " Element : " + this.element;
	}
	
	public void attaque(Elfe elfe){
		Random rd = new Random();
		int numClasse = rd.nextInt(2);
		if (numClasse == 0){
			this.attaque((Magicien) elfe);
		}else{
			this.attaque((Combattant) elfe);
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
	
	public void attaque (Magicien magicien){
		if (magicien.getElement().estOppose(this.element)){
			this.perte(magicien.getForce() * 4);
		}else if (magicien.getElement().equals(this.element)){
			this.perte(magicien.getForce());
		}else{
			this.perte(magicien.getForce() * 2);
		}
		this.setForce(this.getForce() + 1);
	}
	
	public void attaque (Vivant vivant){
		
	}
	
	public void subitAttaque(Magicien magicien){
		if (this.getElement() == magicien.getElement()){
			this.perte(magicien.getForce());
		}else if (this.getElement().estOppose(magicien.getElement())){
			this.perte(magicien.getForce() * 4);
		}else{
			this.perte(magicien.getForce() * 2);
		}
	}
	
	public void subitAttaque(Combattant combattant){
		if (this.getArme() == combattant.getArme()){
			this.perte(combattant.getForce());
		}else{
			this.perte(combattant.getArme().puissance() * combattant.getForce());
		}
	}
	
	public Element getElement(){
		return this.element;
	}

	public Arme getArme() {
		return this.arme;
	}

}
