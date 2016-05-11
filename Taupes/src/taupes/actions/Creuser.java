package taupes.actions;

import taupes.parcelles.*;

public class Creuser extends Action {

	public Creuser(Taupe t, int idxDirection) {
		super(t, idxDirection);
	}

	public void agit() {
		taupe.getVue().creuserTrou(taupe, coordonnees);
	}

}
