package personnages.concret;

public enum Element {

	EAU, FEU, TERRE, AIR;
	
	Element(){}
	
	public boolean estOppose(Element e){
		if ((this == AIR && e == TERRE) || (this == TERRE && e == AIR) || (this == FEU && e == EAU) || (this == EAU && e == FEU)){
			return true;
		}else{
			return false;
		}
	}
	
	public Element getOppose(){
		if (this == EAU){
			return FEU;
		}else if (this == FEU){
			return EAU;
		}else if (this == TERRE){
			return AIR;
		}else if (this == AIR){
			return TERRE;
		}else{
			return null;
		}
	}
}
