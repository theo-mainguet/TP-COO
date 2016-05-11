import java.util.ArrayList;
import java.util.List;

public class Piece implements Assemblable {

	private int numero;
	private String nom;
	private Assemblage assemblage;

	public Piece() {
		this.numero = 0;
		this.nom = "";
	}

	public Piece(int numero, String nom) {
		this.numero = numero;
		this.nom = nom;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getNom() {
		return this.nom;
	}

	public List<Assemblage> listeAssemblage() {
		List<Assemblage> res = new ArrayList<>();
		res.add(this.assemblage);
		if (this.assemblage instanceof Assemblable) {
			res.addAll(((Assemblable) this.assemblage).listeAssemblage());
		}
		return res;
	}

	public Assemblage getAssemblage() {
		return this.assemblage;
	}

	public void setAssemblage(Assemblage a) {
		this.assemblage = a;
	}
	
	public String toString(){
		return this.nom + "(N°" + this.numero + ")";
	}
}
