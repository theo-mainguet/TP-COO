package taupes.actions;

import taupes.parcelles.Taupe;

public class PoserTas extends Action {

	public PoserTas(Taupe t, int idxDirection) {
		super(t, idxDirection);
	}

	public void agit() {
		taupe.getVue().poserTas(coordonnees);

	}

}
