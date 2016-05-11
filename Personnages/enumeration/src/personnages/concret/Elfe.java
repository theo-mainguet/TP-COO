package personnages.concret;

import personnages.abstrait.Combattant;
import personnages.abstrait.Magicien;
import personnages.abstrait.Personnage;
import personnages.abstrait.Vivant;

public class Elfe extends Personnage implements Magicien, Combattant {

	
	private boolean estGuerrier;
	private Element element;
	private Arme arme;

	public Elfe(){
		super();
	}
	public Elfe(String nom){
		super(nom);
		arme = Arme.values()[ALEA.nextInt(3)];
		element = Element.values()[ALEA.nextInt(4)];
	}
	public Elfe(String nom, Arme arme, Element element){
		this(nom);
		this.arme = arme;
		this.element = element;
	}
	
	public void attaque(Elfe e) {
		if (ALEA.nextBoolean()){
			System.out.println("elfes : mage contre mage");
			e.subitAttaque((Magicien)this);
		}else{
			System.out.println("elfes :guerrier contre guerrier");
			e.subitAttaque((Combattant)this);
		}
		this.setForce(this.getForce()+1);
	}
	@Override
	public void attaque(Combattant c) {
		System.out.println("elfe contre combatant");
		c.subitAttaque((Combattant)this);
		this.setForce(this.getForce()+1);
	}
	@Override
	public void attaque(Magicien m) {
		System.out.println("elfe contre Mage");
		m.subitAttaque((Magicien)this);
		this.setForce(this.getForce()+1);
	}
	@Override
	public void attaque(Vivant v) {
		System.out.println("elfe contre vivant");
		v.subitAttaque(this);
		this.setForce(this.getForce()+1);
	}
	
	

	@Override
	public void subitAttaque(Magicien m) {
		if(m.getElement().estOppose(this.element)){
			this.perte(m.getForce()*4);
		}else if(m.getElement().equals(this.getElement()))
			this.perte(m.getForce());
		else{
			this.perte(m.getForce()*2);
		}
	}
	public void subitAttaque(Combattant c) {
		this.perte(c.getArme().puissance() * this.getForce());
	}

	@Override
	public Element getElement() {
		return element;
	}
	@Override
	public Arme getArme() {
		return arme;
	}
	
	public String toString(){
		return this.getNom();
	}

}
