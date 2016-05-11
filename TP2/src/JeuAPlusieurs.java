/**
 * La classe JeuToutSeul modélise le scénario où "César" joue tout seul au "Jeu de dés"
 */

public class JeuAPlusieurs {

    public static void main(String[] args) {
	Saisie s = new Saisie ();
	int nbJoueurs = s.saisieEntier("Entrez un nombre de joueur :");
	Joueur [] joueurs = new Joueur [nbJoueurs];
	int total = s.saisieEntier("Entrez le total à atteindre :");
	System.out.println(nbJoueurs);
	for (int i = 0; i < joueurs.length; i++){
	    joueurs[i] = new Joueur("");
	}
	for (int j = 0; j < joueurs.length; j++){
	    boolean estValide;
	    do {
		estValide = true;
		System.out.println("a");
		joueurs[j]=new Joueur(s.saisieChaine("Entrez votre nom :"));
		int k = 0;
		while (k < joueurs.length && estValide){
		    System.out.println("b");
		    if (joueurs[j].nom.equals(joueurs[k].nom)){
			estValide = true;
		    }else{
			estValide = false;
		    }
		    k++;
		}
	    }while (!estValide);
	}
	int i = 0;
	while (joueurs[i].cumul < total){
	    joueurs[i].jouer();
	    i = i + 1;
	    if (i == nbJoueurs){
		i = 0;
	    }
	}
	Joueur tmp = new Joueur("");
	for (int j = 0; j < joueurs.length; j++){
	    if (j == 0){
		tmp = joueurs[j];
	    }else{
		if (tmp.cumul < joueurs[j].cumul && tmp.nbLancers > joueurs[j].nbLancers){
		    tmp = joueurs[j];
		}
	    }
	}
	System.out.println("Le gagnant est : " + tmp.nom);
    }
}
