import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Agenda {

	ArrayList<Evenement> agenda = new ArrayList<>();

	boolean entrable(Evenement evenement) {
		for (Evenement comp : agenda) {
			if (comp.chevauche(evenement)) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		return agenda.toString();
	}

	public void entrerEvenement(Evenement evenement) {
		agenda.add(evenement);
	}

	public void supprimerEvenement(Evenement evenement) {
		agenda.remove(evenement);
	}

	public void supprimerEvenement(int indice) {
		agenda.remove(indice);
	}

	void supprimerChevauchement(Evenement evenement) {
		for (Evenement even : agenda) {
			if (even.chevauche(evenement)) {
				agenda.remove(even);
			}

		}
	}

	public ArrayList<Contact> contacts_concernes(Evenement e) {
		ArrayList<Contact> res = new ArrayList<>();
		Object[] liste = e.contacts.keySet().toArray();
		for (int i = 0; i < liste.length; i++) {
			res.add(e.contacts.get(liste[i]));
		}
		return res;
	}

	public ArrayList<Contact> contacts_concernes(Evenement[] e,
			GregorianCalendar d, GregorianCalendar f) {
		ArrayList<Contact> res = new ArrayList<>();
		Evenement tmp = new Evenement("tmp", null, d, f);
		for (int i = 0; i < e.length; i++) {
			if (tmp.chevauche(e[i])) {
				Object[] liste = e[i].contacts.keySet().toArray();
				for (int j = 0; j < liste.length; j++){
					res.add(e[i].contacts.get(liste[j]));
				}
			}
		}
		return res;
	}
	
	public ArrayList<Evenement> even_associes(Contact c){
		ArrayList<Evenement> res = new ArrayList<>();
		for (int i = 0; i < agenda.size(); i++){
			if (agenda.contains(c)){
				res.add(agenda.get(i));
			}
		}
		return res;
	}
}
