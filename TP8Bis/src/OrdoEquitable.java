
public class OrdoEquitable extends OrdoAvecPriorite{
	
	private int nb0;
	private int nb1;
	private int nb2;
	private int nb3;
	
	public OrdoEquitable(){
		this.nb0 = 0;
		this.nb1 = 0;
		this.nb2 = 0;
		this.nb3 = 0;
	}
	
	public Prioritaire plusPrioritaire() {
		for (int i = 0; i < list.length; i++) {
			if (!list[i].estVide()) {
				return list[i].plusPrioritaire();
			}
		}
		return null;
	}
	
}
