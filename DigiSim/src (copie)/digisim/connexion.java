package digisim;

public class connexion implements Entree, Sortie {
	protected Sortie from = null;
	
	public connexion(){}
	
	public void connectTo(Sortie sortie) {
		this.from = sortie;
	}

	public boolean valeur() {
		if (this.from == null){
			return false;
		}else{
			return from.valeur();
		}
	}

}