import java.util.Random;
public class Bingo {

    int nbJ = 3;
    String nomJ = "";

    void Bingo(String nom){
	Joueur nomJ = new Joueur (nom);
	Grille grille = new Grille (3,5);
	grille.remplir(1,99);
    }

    Joueur jouer(){
	boolean fin = false;
	Random rd = new Random();
	while (fin == false){
	    int numero = rd.nextInt(99) + 1;
	    boolean sortir = false;
	    for (int i = 0; i < grille.length; i++){
		for (int j = 0; j < grille[i].length; j++){
		    if (numero == grille[i][j]){
			grille[i][j] = null;
			sortir = true;
			break;
		    }
		}
		if (sortir == true){
		    break;
		}
	    }
	    
    
