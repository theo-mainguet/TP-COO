package personnages.concret;

import personnages.abstrait.Magicien;
import personnages.abstrait.Personnage;

public class Mage extends Personnage implements Magicien {

	private Element element;

	public Mage(){
		super();
		element = Element.values()[ALEA.nextInt(4)];
	}
	public Mage(String nom){
		super(nom);
		element = Element.values()[ALEA.nextInt(4)];
	}
	public Mage(String nom, Element element){
		super(nom);
		this.element = element;
	}


	@Override
	public void attaque(Magicien m) {
		System.out.println("mage contre mage");
		m.subitAttaque(this);
		this.setForce(this.getForce() + 1);	
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

	@Override
	public Element getElement() {
		return element;
	}
	
	public String toString(){
		return this.getNom();
	}

}
