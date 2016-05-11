public interface Ordonnanceur {
	/** ajoute un objet prioritaire à l'ordonnanceur */
	public void ajouteObjet(Prioritaire p);

	/**
	 * extrait l'objet qui doit sortir le plus tôt et le supprime de
	 * l'ordonnanceur
	 */
	public Prioritaire plusPrioritaire();

	/** retourne vrai s'il n'y a plus d'objets dans l'ordonnanceur */
	public boolean estVide();
}