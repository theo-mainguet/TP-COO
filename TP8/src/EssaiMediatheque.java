import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class EssaiMediatheque {

	public static void main(String[] args) {
		Mediatheque media = new Mediatheque();
		media.ajouterDocument(new Document("Jambon", "Théo",
				new GregorianCalendar(), "th1"));
		media.ajouterDocument(new Document("Beurre", "Robin",
				new GregorianCalendar(), "ro1"));
		media.ajouterDocument(new Document("Caramel", "Booba",
				new GregorianCalendar(), "bo1"));
		System.out.println(media.rechercherCote("th1"));
		media.ajouterDocument(new Livre("Fromage", "Robin",
				new GregorianCalendar(), "ro2", "IUT", 4));
		media.ajouterDocument(new Livre("Blanc", "Théo",
				new GregorianCalendar(), "th2", "IUTA", 175));
		media.ajouterDocument(new Dvd("FromageBlanc", "Robin",
				new GregorianCalendar(), "ro3", "IUT", 2));
		media.ajouterDocument(new Dvd("JambonBeurre", "Théo",
				new GregorianCalendar(), "th3", "IUTA", 95));
		media.emprunter("ro2", 1);
		media.emprunter("th2", 2);
		media.emprunter("ro3", 23);
		media.emprunter("th3", 14);
		List<Document> enRetard = new ArrayList<>();
		for (Document d : media.docs) {
			if (d.getEmprunteur() >= 0) {
				if (d.dateRetour().before(new GregorianCalendar())) {
					enRetard.add(d);
				}
			}
		}
	}
}
