/**
 * La classe JeuToutSeul modélise le scénario où "César" joue tout seul au "Jeu de dés"
 */
public class JeuToutSeulBis {
    public static void main(String[] args) {
	//Initialisation du total à atteindre
	int total=0;
	//Création d'un Joueur appelé César
	JoueurBis cesar=new JoueurBis("César");
	//On fait jouer César jusqu'à ce que il ait atteint le total demandé
	while(cesar.cumul>total) {
	    cesar.jouer();
	}
	//Affichage du nombre de lancers nécessaires pour que César atteigne le total voulu
	System.out.println(cesar.nbLancers);
    }
}
