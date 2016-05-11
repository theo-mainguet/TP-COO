import java.util.Random;
public class Tirages {

    public static void main (String [] args){
	// on genere un nombre aleatoire entre 5 et 10
	Random rd = new Random();
	int nbEnts = rd.nextInt(6) + 5;
	// on genere les valeurs une a une entre 10 et 20, et on calcul la moyenne
	int [] tab = new int [nbEnts];
	double moyenne = 0;
	int min = 0;
	int max = 0;
	for (int i = 0; i < tab.length; i++){
	    tab[i] = rd.nextInt(11) + 10;
	    moyenne = moyenne + tab[i];
	    if (i == 0){
		min = tab[i];
		max = tab[i];
	    }else{
		if (tab[i] > max){
		    max = tab[i];
		}else if (tab[i] < min){
		    min = tab[i];
		}
	    }
	}
	String liste = "";
	for (int i = 0; i < tab.length; i++){
	    liste = liste + " " + tab[i];
	}
	System.out.println("Liste generee :" + liste);
	moyenne = moyenne / nbEnts;
	System.out.println("Moyenne : " + moyenne + "; Min : " + min + "; Max : " + max);
    }
}
