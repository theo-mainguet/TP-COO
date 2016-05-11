package taupes.actions;

import taupes.parcelles.Taupe;
import taupes.terrain.Constante;
import taupes.terrain.Coordonnees;

public abstract class Action {

	protected int direction;
	protected Coordonnees coordonnees;
	protected Taupe taupe;
	
	public Action(Taupe t, int idxDirection){
		direction = idxDirection;
		
		Coordonnees dir = new Coordonnees(0, 0);
		switch(idxDirection){
		case 0: dir = Constante.HAUT; break;
		case 1: dir = Constante.BAS; break;
		case 2: dir = Constante.DROITE; break;
		case 3: dir = Constante.GAUCHE; break;
		default: break;
		}
		coordonnees = t.getCoordonnees().modifier(dir);
		taupe = t;
	}
	
	public Coordonnees getCoordonnees(){
		return coordonnees;
	}
	
	abstract public void agit();
}
