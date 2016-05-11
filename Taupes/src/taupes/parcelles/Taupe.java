package taupes.parcelles;
import taupes.terrain.*;

public class Taupe {
	private int equipe;
	private Vue vue;
	private Coordonnees coordonnees;
	
	public Taupe(int e, Vue v){
		this.equipe = e;
		this.vue = v;
		this.vue.poserTaupe(this, new Coordonnees(2,2));
	}
	
	public Taupe(int e, Vue v, int x, int y){
		this.equipe = e;
		this.vue = v;
		this.coordonnees = new Coordonnees(x, y);
		this.vue.poserTaupe(this, this.coordonnees);
	}
	
	public int getEquipe(){
		return this.equipe;
	}
	
	public Vue getVue(){
		return this.vue;
	}
	
	public Coordonnees getCoordonnees(){
		return this.coordonnees;
	}
	
	public void setCoord(Coordonnees coordonnees){
		this.coordonnees = coordonnees;
	}
}
