package personnages.concret;

import java.util.Random;

import personnages.abstrait.Magicien;
import personnages.abstrait.Personnage;

public class Mage extends Personnage implements Magicien {
	
	private Element element;
	
	public Mage(){
		super();
		Random rd = new Random();
		int numElement = rd.nextInt(4);
		this.element = Element.values()[numElement];
	}
	
	public Mage(String nom){
		super(nom);
		Random rd = new Random();
		int numElement = rd.nextInt(4);
		this.element = Element.values()[numElement];
	}
	
	public Mage(String nom, Element element){
		super(nom);
		this.element = element;
	}
	
	public String toString(){
		return super.toString() + " Element : " + this.element;
	}

	public void attaque(Magicien magicien) {
		magicien.subitAttaque(this);
		this.setForce(this.getForce() + 1);
	}

	public void subitAttaque(Magicien magicien) {
		if (magicien.getElement().estOppose(this.element)){
			this.perte(magicien.getForce() * 4);
		}else if (magicien.getElement().equals(this.element)){
			this.perte(magicien.getForce());
		}else{
			this.perte(magicien.getForce() * 2);
		}
		this.setForce(this.getForce() + 1);
	}

	public Element getElement() {
		return this.element;
	}
	
}
