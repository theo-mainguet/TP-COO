import java.util.Random;
public class Grille {

    int [][] grille;

    Grille (int x, int y){
	grille = new int [x][y];
    }

    boolean remplir (int min, int max){
	if (min < max){
	    Random rd = new Random();
	    for (int i = 0; i < grille.length; i++){
		for (int j = 0; j < grille[i].length; j++){
		    grille [i][j] = rd.nextInt(max - min + 1) + min;
		}
	    }
	    return true;
	}else{
	    return false;
	}
    }

    void afficher(){
	System.out.println("Grille :");
	for (int i = 0; i < grille.length; i++){
	    for (int j = 0; j < grille[i].length; j++){
		if (j == 0){
		    System.out.print("\t" + "|" + grille[i][j]);
		}else{
		    System.out.print("|" + grille[i][j]);
		}		
	    }
	    System.out.println();
	}
    }

    void fenetre(int left, int top){
	Tableau tab = new Tableau (left, top, grille);
    }

    boolean remplir (int min, int max, boolean doublons, float taux){
	int remplissage = (int)(taux * 10);
	double nbCases = (double)(taux * (grille.length * grille[0].length));
	int cpt = 0;
	boolean res = true;
	System.out.println(nbCases);
	while (cpt < nbCases){
	    if (min < max){
		Random rd = new Random();
		for (int i = 0; i < grille.length; i++){
		    for (int j = 0; j < grille[i].length; j++){
			int valeur = rd.nextInt(11);
			if (valeur < remplissage && cpt < nbCases){
			    int alea = rd.nextInt(max - min + 1) + min;
			    if (doublons){
				grille[i][j] = alea;
				cpt = cpt + 1;
			    }else{
				boolean estValide = true;
				do{
				    for (int k = 0; k < grille.length; k++){
					for (int l = 0; l < grille[k].length; l++){
					    if (grille[k][l] == alea){
						estValide = false;
						break;
					    }
					}
					if (estValide == false){
					    break;
					}
				    }
				    alea = rd.nextInt(max - min + 1) + min;
				}while (estValide == false);
				grille[i][j] = alea;
				cpt = cpt + 1;
			    }
			}
		    }
		}
		res = true;
	    }else{
		res = false;
	    }
	}
	return res;
    }
}
