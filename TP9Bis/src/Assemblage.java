import java.util.*;
public abstract class Assemblage {

	private List<Assemblable> liste;
	
	public Assemblage(){
		this.liste = new ArrayList<>();
	}
	
	public String toString() {
		String res = "{";
		for (Assemblable a : liste) {
			if (res.equals("{")) {
				res += "\t" + a + "\n";
			}else{
				res += "\t" + a + "\n";
			}
		}
		return res + "}";
	}
	
	public void addAssemblable(Assemblable a){
		a.setAssemblage(this);
		this.liste.add(a);
	}
	
	public void removeAssemblable(Assemblable a){
		this.liste.remove(a);
		a.setAssemblage(null);
	}
	
}
