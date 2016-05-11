import java.util.ArrayList;
import java.util.List;


public class OrdoFile implements Ordonnanceur {
	List<Prioritaire> liste;
	public void ajouteObjet(Prioritaire p) {
		this.liste.add(p);
	}

	public Prioritaire plusPrioritaire() {
		Prioritaire tmp = this.liste.get(0);
		this.liste.remove(0);
		return tmp;
	}

	public boolean estVide() {
		if (liste.size() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public OrdoFile(){
		liste = new ArrayList<>();
	}
	
	public String toString(){
		return liste.toString();
	}
}
