public class OrdoAvecPriorite implements Ordonnanceur {
	protected final int nbmax = 6;
	protected OrdoFile[] list;

	public OrdoAvecPriorite() {
		this.list = new OrdoFile[nbmax];
		for (int i = 0; i < list.length; i++) {
			list[i] = new OrdoFile();
		}
	}

	public OrdoFile[] getList() {
		return this.list;
	}
	
	

	public void ajouteObjet(Prioritaire p) {
		if (p.getPriorite() == 0) {
			list[0].ajouteObjet(p);
		} else if (p.getPriorite() == 1) {
			list[1].ajouteObjet(p);
		} else if (p.getPriorite() == 2) {
			list[2].ajouteObjet(p);
		} else if (p.getPriorite() == 3) {
			list[3].ajouteObjet(p);
		} else if (p.getPriorite() == 4) {
			list[4].ajouteObjet(p);
		} else if (p.getPriorite() == 5) {
			list[5].ajouteObjet(p);
		}
	}

	public Prioritaire plusPrioritaire() {
		for (int i = 0; i < list.length; i++) {
			if (!list[i].estVide()) {
				return list[i].plusPrioritaire();
			}
		}
		return null;
	}

	@Override
	public boolean estVide() {
		for (int i = 0; i < list.length; i++) {
			if (!list[i].estVide()){
				return false;
			}
		}
		return true;
	}
}