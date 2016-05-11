package taupes.terrain;

import taupes.parcelles.Taupe;

/**
 * La classe Vue modélise la vision du terrain qu'a une équipe
 * 
 * @author M2103
 */
public class Vue {
	private Terrain terrain;

	/**
	 * Créer une Vue pour une équipe et lui associe un Terrain
	 * 
	 * @param terrain
	 *            le terrain
	 */
	public Vue(Terrain terrain) {
		this.terrain = terrain;
	}

	/**
	 * Dépose une Taupe dans la parcelle de coordonnées c
	 * 
	 * @param taupe
	 *            la taupe
	 * @param coordonnee
	 *            coordonnées de la parcelle
	 */
	public void poserTaupe(Taupe taupe, Coordonnees coordonnee) {
		if (this.estTerrain(coordonnee)
				&& !(terrain.estMur(coordonnee.getAbscisse(),
						coordonnee.getOrdonnee()))
				&& !(estTas(coordonnee))
				&& terrain.estTrou(coordonnee.getAbscisse(),
						coordonnee.getOrdonnee()) != taupe.getEquipe()) {
			setLibre(taupe.getCoordonnees());
			terrain.poserTaupe(coordonnee.getAbscisse(),
					coordonnee.getOrdonnee(), taupe);
			if (!Terrain.fin)
				taupe.setCoord(coordonnee);
		}
	}

	public Terrain getTerrain(){
		return this.terrain;
	}
	
	/**
	 * Retourne vrai si les coordonnées passées en paramétre sont dans le
	 * terrain
	 * 
	 * @param coordonnees
	 *            les coordonnées
	 * @return vrai si les coordonnées passées en paramétre sont dans le terrain
	 */
	public boolean estTerrain(Coordonnees coordonnees) {
		return coordonnees.getAbscisse() > 0
				&& coordonnees.getAbscisse() < Terrain.getTaille()
				&& coordonnees.getOrdonnee() > 0
				&& coordonnees.getOrdonnee() < Terrain.getTaille();
	}

	/**
	 * Vide la parcelle de coordonnées c
	 * 
	 * @param c
	 *            coordonnées de la parcelle
	 */
	public void setLibre(Coordonnees c) {
		terrain.setLibre(c.getAbscisse(), c.getOrdonnee());
	}

	/**
	 * Retourne vrai si la parcelle passée en paramétre est un Tas
	 * 
	 * @param c
	 *            coordonnées de la parcelle
	 * @return vrai si la parcelle passée en paramétre est un Tas
	 */
	public boolean estTas(Coordonnees c) {
		return terrain.estTas(c.getAbscisse(), c.getOrdonnee());
	}

	/**
	 * Pose un Tas sur la parcelle de coordonnées passées en paramétre
	 * 
	 * @param coordonnees
	 *            coordonnées de la parcelle
	 */
	public void poserTas(Coordonnees coordonnees) {
		terrain.poserTas(coordonnees.getAbscisse(), coordonnees.getOrdonnee());
	}

	/**
	 * La Taupe passée en paramétre creuse un Trou dans la parcelle de
	 * coordonnées coordonnees
	 * 
	 * @param taupe
	 *            la taupe
	 * @param coordonnees
	 *            coordonnées de la parcelle
	 */
	public void creuserTrou(Taupe taupe, Coordonnees coordonnees) {
		terrain.creuserTrou(coordonnees.getAbscisse(),
				coordonnees.getOrdonnee(), taupe.getEquipe());
	}
}
