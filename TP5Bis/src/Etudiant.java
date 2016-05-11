import java.util.*;

public class Etudiant {

	String nom;
	HashMap<String, Integer> liste = new HashMap<>();

	Etudiant() {
		this.nom = null;
		this.liste.put(null, null);
	}

	Etudiant(String nom, String[] module, Integer[] notes) {
		this.nom = nom;
		if (module.length == notes.length) {
			for (int i = 0; i < module.length; i++) {
				this.liste.put(module[i], notes[i]);
			}
		}
	}

	public String toString() {
		Object[] liste2 = liste.keySet().toArray();
		String ligne = "";
		for (int i = 0; i < liste2.length; i++) {
			ligne = ligne + " -" + liste2[i] + " - " + liste.get(liste2[i]);
		}
		return ligne;
	}
	
	
}