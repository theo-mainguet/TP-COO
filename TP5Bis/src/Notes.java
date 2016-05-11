import java.util.HashMap;

import javax.swing.JOptionPane;

public class Notes {

	public static void main(String[] args) {
		/*
		 * HashMap<String, String> notes = new HashMap<>(); notes.put("Pierre",
		 * "11, 16, 17, 20, 10"); notes.put("Paul", "10, 13, 11, 18, 13");
		 * notes.put("Jacques", "11, 14, 19, 11, 17"); notes.put("Vincent",
		 * "10, 15, 14, 20, 13"); notes.put("Francois", "15, 13, 19, 17, 11");
		 * boolean present = false; while (present != true) { String nom =
		 * JOptionPane.showInputDialog(null, "Entrez un nom d'étudiant :"); if
		 * (notes.containsKey(nom)) { JOptionPane.showMessageDialog(null,
		 * "Notes de " + nom + " " + notes.get(nom)); present = true; } else {
		 * JOptionPane.showMessageDialog(null, "L'étudiant " + nom +
		 * " n'existe pas."); } }
		 * 
		 * boolean present = false; while (present != true) { String nom =
		 * JOptionPane.showInputDialog(null, "Entrez un nom d'étudiant :"); if
		 * (notes.containsKey(nom)) { JOptionPane.showMessageDialog(null,
		 * "Notes de " + nom + " " + notes.get(nom)); present = true; } else {
		 * JOptionPane.showMessageDialog(null, "L'étudiant " + nom +
		 * " n'existe pas."); } }
		 */
		HashMap<String, Etudiant> etu = new HashMap<>();
		Etudiant e1 = new Etudiant("Pierre", new String[] { "ap", "asr" },
				new Integer[] { 11, 13 });
		Etudiant e2 = new Etudiant("Paul", new String[] { "bdd", "analyse" },
				new Integer[] { 11, 14 });
		Etudiant e3 = new Etudiant("Jacques", new String[] { "poo", "coo" },
				new Integer[] { 14, 20 });
		Etudiant e4 = new Etudiant("Vincent", new String[] { "eco", "droit" },
				new Integer[] { 11, 20 });
		Etudiant e5 = new Etudiant("Francois", new String[] { "ppp", "com" },
				new Integer[] { 11, 13 });
		etu.put("Pierre", e1);
		etu.put("Paul", e2);
		etu.put("Jacques", e3);
		etu.put("Vincent", e4);
		etu.put("Francois", e5);
		boolean present = false;
		while (present != true) {
			String nom = JOptionPane.showInputDialog(null,"Entrez un nom d'étudiant :");
			if (etu.containsKey(nom)) {
				Etudiant tmp = etu.get(nom);
				System.out.println(tmp.toString());
				present = true;
			}
		}
	}
}
