/**
 * La classe Joueur modélise un joueur de dés avec son nom, son cumul de points et son nombre de lancers
 */
public class Joueur {
    /**
     * Nom du joueur
     */
    String nom ;
    /**
     * Cumul du joueur
     */
    int cumul ;
    /**
       Nombre de lancers du joueur
    */
    int nbLancers ;
    /**
       Génerateur valeurs aléatoires
    */
    java.util.Random r=new java.util.Random();
    /**
     * Crée un Joueur avec un nom n, cumul et nombre de lancers à 0
     * @param n le nom du joueur
     */
    Joueur(String n){
	nom=n;
    }
    /**
     * Méthode ajoutant au cumul le résultat d'un lancer de dé
     */
    void jouer() {
	cumul += r.nextInt(6)+1;
	nbLancers++;
    }
    /**
     * Compare le cumul de deux joueurs
     * @param j le joueur à comparer
     * @return vrai si le cumul du joueur courant est plus grand que celui de j
     */
    boolean bat(Joueur j){
	return nbLancers<j.nbLancers;
    }

    boolean batScore(Joueur j){
	return cumul < j.cumul;
    }
    /**
     * Retourne une chaîne représentant l'état d'un Joueur
     * @return la chaîne représentant l'état d'un Joueur
     */
    public String toString() {
	return "Joueur [nom=" + nom + ", nbLancers=" + nbLancers + ", cumul=" + cumul + "]";
    }
}
