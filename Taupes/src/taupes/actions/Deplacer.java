package taupes.actions;

import taupes.parcelles.Taupe;

public class Deplacer extends Action{

	public Deplacer(Taupe t, int idxDirection) {
		super(t, idxDirection);
	}

	public void agit() {
		taupe.getVue().setLibre(coordonnees);
		taupe.getVue().poserTaupe(taupe, coordonnees);
	}

}
