package digisim;

public class Xor2 extends Any2 implements Sortie{
	public Xor2(Sortie BorneA, Sortie BorneB) {
		super(BorneA,BorneB);
	}
	
	public boolean valeur(){
		return  (getEntreeA().valeur() ^ getEntreeB().valeur());
	}
}
