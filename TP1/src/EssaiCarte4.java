import java.util.Random;
public class EssaiCarte4{
    
    public static void main (String[] args){
	Carte [] c = new Carte [32];
	initialiserPaquet(c);
	melanger(c);
        affichage(c);
    }


    static void initialiserPaquet (Carte [] c){
	int pos = 0;
	for (int i = 0; i < 4; i++){
	    for (int j = 0; j < 8; j++){
		c[pos] = new Carte (i,j);
		pos = pos + 1;
	    }
	}
    }
    
    static void melanger(Carte [] c){
	Random rd = new Random();
	Carte tmp;
	for (int i = 0; i < 32; i++){
	    int c1 = rd.nextInt(32);
	    int c2 = rd.nextInt(32);
	    tmp = c[c1];
	    c[c1] = c[c2];
	    c[c2] = tmp;
	}
    }

    static void affichage (Carte [] c){
	for (int i = 0; i < c.length; i++){
	    System.out.println(c[i]);
	}
    }

    static void tri (Carte [] c){
	int fin = c.length;
	boolean permut = true;
	do{
	    permut = false;
}
