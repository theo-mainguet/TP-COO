package digisim;

public class And2 extends Any2{

	public And2() {}
	
	public And2(Sortie BorneA, Sortie BorneB) {
		super(BorneA,BorneB);
	}
	
	public boolean valeur() {
		return (getEntreeA().valeur() & getEntreeB().valeur());
	}

}