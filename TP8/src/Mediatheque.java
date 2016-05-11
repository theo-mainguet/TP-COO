import java.util.ArrayList;
import java.util.List;


public class Mediatheque {
	
	List <Document> docs;

	public Mediatheque(){
		docs = new ArrayList <>();
	}
	
	public void ajouterDocument(Document document){
		if (!this.docs.contains(document.getCote())){
			docs.add(document);
		}
	}
	
	public Document rechercherCote(String cote){
		for (Document d : docs){
			if (d.getCote().equals(cote)){
				return d;	
			}
		}
		return null;
	}
	
	public void afficherEmprunts(){
		for (Document d : docs){
			if (d.getEmprunteur() >= 0){
				System.out.println(d.toString());
			}
		}
	}
	
	public boolean emprunter(String cote, int emprunteur){
		for (Document d : docs){
			if (d.getCote().equals(cote)){
				d.emprunt(emprunteur);
				return true;
			}
		}
		return false;
	}
	
	public boolean restituer(String cote){
		for (Document d : docs){
			if (d.getCote().equals(cote)){
				d.setEmprunteur(-1);
				return true;
			}
		}
		return false;
	}
}
