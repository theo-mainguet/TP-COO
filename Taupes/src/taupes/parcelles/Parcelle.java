package taupes.parcelles;

import taupes.terrain.*;

public class Parcelle {
	private int trou;
	private boolean tas;
	private boolean mur;
	private Coordonnees coordonnees;
	private Taupe taupe;
	
	public Parcelle(int a, int b){
		coordonnees = new Coordonnees(a,b);
	}
	
	public Coordonnees getCoordonnees(){
		return this.coordonnees;
	}
	
	public void setCoordonnees(Coordonnees c){
		this.coordonnees = c;
	}
	

	public Taupe getTaupe(){
		return taupe;
	}
	
	public int estTrou(){
		return trou;
	}
	
	public void setTrou(int i){
		trou = i;
	}
	
	public boolean estTas(){
		return tas;
	}
	
	public void setTas(boolean b){
		tas = b;
	}
	
	public boolean estMur(){
		return mur;
	}
	
	public void setMur(boolean b){
		mur = b;
	}
	
	public int estTaupe(){
		if (taupe != null){
			return taupe.getEquipe();
		}
		return 0;
	}
	
	public void poserTas(){
		System.out.println("Cette case est un trou : " + this.trou + ", un tas : "+ this.tas);
		if (this.trou != 0){
			boucherTrou();
		}else if (this.getTaupe() != null){
			this.retirerTaupe();
		}else{
			this.tas = true;
		}
	}
	
	public void retirerTas(){
		tas = false;
	}
	
	public void boucherTrou(){
		trou = 0;
	}

	public void poserTaupe(Taupe t){
		taupe = t;
	}
	
	public void retirerTaupe(){
		taupe = null;
	}
	
	public void creuserTrou(int i){
		System.out.println("Cette case est un trou : " + this.trou + ", un tas : "+ this.tas);
		if (this.tas){
			retirerTas();
		}else if (this.getTaupe() != null){
			this.retirerTaupe();
		}else{
			this.trou = i;
		}
	}
	
	public void vider(){
		retirerTas();
		retirerTaupe();
		setMur(false);
		setTrou(0);
	}
}

