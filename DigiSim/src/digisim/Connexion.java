package digisim;

public class Connexion implements Entree, Sortie {
	protected Sortie from = null;
	
	public Connexion(){}
	
	public void connectTo(Sortie sortie) {
		this.from = sortie;
	}

	public boolean valeur() {
		if (this.from == null){
			return false;
		}else{
			return true;
		}
	}

}
