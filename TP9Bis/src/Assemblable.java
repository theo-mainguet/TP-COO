import java.util.List;


public interface Assemblable {
	
	public String getNom();
	public Assemblage getAssemblage();
	public List<Assemblage> listeAssemblage();
	public void setAssemblage(Assemblage a);
}
