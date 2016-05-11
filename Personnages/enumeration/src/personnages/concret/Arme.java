package personnages.concret;

public enum Arme {
	ARC,EPEE,HACHE;
	
	private int degats;
	
	private Arme(){
		degats = ordinal()+1;
	}
	
	public int puissance(){
		return degats;
	}
}
