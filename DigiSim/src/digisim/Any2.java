package digisim;

public abstract class Any2 implements Sortie {

	private Entree entreeA;
	private Entree entreeB;
	
	public Any2(){
		
	}
	
	public Any2(Sortie borneA, Sortie borneB){
		this.entreeA.connectTo(borneA);
		this.entreeB.connectTo(borneB);
	}
	
	public abstract boolean valeur();

	public Entree getEntreeA() {
		return this.entreeA;
	}

	public Entree getEntreeB() {
		return this.entreeB;
	}
}
