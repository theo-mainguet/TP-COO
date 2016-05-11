package digisim;

public class AndN extends AnyN implements Sortie{

	public AndN(int n) {
		super(n);
		
	}
	
	public boolean valeur(){
		boolean etat = entrees[0].valeur();
		
		for (int i = 0; i < entrees.length; i++) {
			etat = entrees[i].valeur() && etat;
		}
		
		return etat;
	}

}
