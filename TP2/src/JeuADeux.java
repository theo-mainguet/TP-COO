/**
 * La classe JeuToutSeul modélise le scénario où "César" joue tout seul au "Jeu de dés"
 */
public class JeuADeux {
    public static void main(String[] args) {
	//Initialisation du total à atteindre
	int total=20;
	//Création d'un Joueur appelé César
	Joueur cesar=new Joueur("César");
	Joueur theo = new Joueur("Théo");
	//On fait jouer César jusqu'à ce que il ait atteint le total demandé
	while(cesar.cumul<total || theo.cumul < total) {
	    cesar.jouer();
	    theo.jouer();
	}
	if (theo.batScore(cesar)){
	    System.out.println("Théo a gagné");
	}else{
	    System.out.println("César a gagné");
	}
    }
}
