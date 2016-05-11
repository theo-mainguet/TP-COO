package digisim;

public class AnyN implements Sortie{
	
	protected connexion[] entrees;
	
	public AnyN(int n) {
		this.entrees = new connexion[n];

		for (int i = 0; i < entrees.length; i++) {
			entrees[i] = new connexion();
		}
		
	}
	
	public Entree getEntree(int n){
		return entrees[n];
	}
	
	@Override
	public boolean valeur() {
		boolean etat = entrees[0].valeur();
		
		for (int i = 0; i < entrees.length; i++) {
			etat = entrees[i].valeur() & etat;
		}
		
		return !etat;
	}

}
