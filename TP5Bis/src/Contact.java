
public class Contact {
	String nom = "";
	String email = "";
	
	Contact(){}
	
	Contact(String nom, String email){
		this.nom = nom;
		this.email = email;
	}
	
	public String toString(){
		return "nom : " + this.nom + "email : " + this.email;
	}
}
