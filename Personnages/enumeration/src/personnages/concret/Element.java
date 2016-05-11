package personnages.concret;

public enum Element {
	EAU(1),FEU(0),TERRE(3),AIR(2);
	
	private int oppose;
	
	private Element(){
	}
	private Element(int i){
		oppose = i;
	}
	
	public boolean estOppose(Element e){
		return this.equals(e.getOppose());
	}
	
	public Element getOppose(){
		return Element.values()[oppose];
	}
}
