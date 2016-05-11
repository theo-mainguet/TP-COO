package digisim;

public class Or2 extends Any2 implements Sortie{
	
	public Or2(Sortie BorneA, Sortie BorneB) {
		super(BorneA,BorneB);
	}
	
	public boolean valeur(){
		return (getEntreeA().valeur() || getEntreeB().valeur());
	}
	
}
