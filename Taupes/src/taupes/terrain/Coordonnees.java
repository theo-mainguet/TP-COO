package taupes.terrain;

/**
 * La classe Coordonnees modélise un couple abscisse ordonnée
 * @author M2103
 *
 */
public class Coordonnees {

	 private int abscisse,ordonnee;

	/**
	 * Crée un couple de coordonnées
	 * @param abscisse l'abscisse
	 * @param ordonnee l'ordonnée
	 */
	public Coordonnees(int abscisse, int ordonnee) {
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
		
	/**
	 * Retourne l'abscisse
	 * @return l'abscisse
	 */
	public int getAbscisse() {
		return abscisse;
	}

	/**
	 * Retourne l'ordonnée
	 * @return l'ordonnée
	 */
	public int getOrdonnee() {
		return ordonnee;
	}

	/**
	 * Modifie les coordonnées en ajoutantle couple de coordonnées passé en paramètre
	 * @param coordonnees les coordonnées ajoutées
	 * @return les nouvelles coordonnées
	 */
	public Coordonnees modifier(Coordonnees coordonnees) {
		return new Coordonnees (this.abscisse+coordonnees.abscisse, this.ordonnee+coordonnees.ordonnee);
	}
}
