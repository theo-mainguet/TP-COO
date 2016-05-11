public class EssaiGrille {

    public static void main (String [] args){
	Grille tab = new Grille (3,5);
	if (tab.remplir(0,100,false,0.7f)){
	    tab.afficher();
	    tab.fenetre(200,400);
	}
    }
}
