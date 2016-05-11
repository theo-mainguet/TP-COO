package digisim;

public class Fixe implements Sortie {

	private final boolean VALEUR;
	public static Sortie TRUE;
	public static Sortie FALSE;
	
	public boolean getVALEUR() {
		return this.VALEUR;
	}
	public Fixe(boolean valeur){
		this.VALEUR = valeur;
	}
	
	public boolean valeur() {
		return this.VALEUR;
	}

}
