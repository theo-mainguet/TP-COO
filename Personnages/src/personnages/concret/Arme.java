package personnages.concret;

public enum Arme {
	ARC, EPEE, HACHE;
	
	Arme(){}
	
	public int puissance(){
		if (this == ARC){
			return 1;
		}else if (this == EPEE){
			return 2;
		}else if (this == HACHE){
			return 3;
		}else{
			return 0;
		}
	}
}
