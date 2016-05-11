public class EssaiCarte {

    public static void main (String[] args){
	for (int i = 0; i < 4; i++){
	    for (int j = 0; j < 8; j++){
		Carte c = new Carte (i,j);
		System.out.println(c.toString());
	    }
	}
    }
}
