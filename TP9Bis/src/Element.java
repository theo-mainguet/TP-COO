import java.util.ArrayList;
import java.util.List;


public class Element extends Assemblage implements Assemblable {

	private String nom;
	private Assemblage assemblage;

	public Element() {
		this.nom = "";
	}

	public Element(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}
	
	public String toString(){
		return this.nom + "\n" + "\t" + super.toString();
	}

	public Assemblage getAssemblage() {
		return this.assemblage;
	}

	public List<Assemblage> listeAssemblage() {
		List <Assemblage> res = new ArrayList<>();
		res.add(this.assemblage);
		if (this.assemblage instanceof Assemblable){
			res.addAll(((Assemblable)this.assemblage).listeAssemblage());
		}
		return res;
	}

	public void setAssemblage(Assemblage a) {
		this.assemblage = a;
	}

}
