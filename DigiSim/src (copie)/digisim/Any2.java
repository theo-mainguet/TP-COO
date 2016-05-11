
package digisim;

public abstract class Any2 implements Sortie {

	private Entree entreeA;
	private Entree entreeB;
	
	public Any2(){
		
	}
	
	public Any2(Sortie borneA, Sortie borneB){
		this.entreeA = new Entree() {
			
			@Override
			public boolean valeur() {
				return borneA.valeur();
			}
			
			@Override
			public void connectTo(Sortie sortie) {
				// TODO Auto-generated method stub
				
			}
		};
		
		this.entreeB = new Entree() {
			
			@Override
			public boolean valeur() {
				return borneB.valeur();
			}
			
			@Override
			public void connectTo(Sortie sortie) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public boolean valeur(){
		return ! (getEntreeA().valeur() & getEntreeB().valeur()) ;
	}

	public Entree getEntreeA() {
		return this.entreeA;
	}

	public Entree getEntreeB() {
		return this.entreeB;
	}
}