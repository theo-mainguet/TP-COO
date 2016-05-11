package digisim;

public class Fixe implements Sortie {

	private final boolean VALEUR;
	public static final Sortie TRUE = new Sortie() {
		@Override
		public boolean valeur() {
			return true;
		}
	};
	public static final Sortie FALSE = new Sortie() {
		@Override
		public boolean valeur() {
			return false;
		}
	};
	
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