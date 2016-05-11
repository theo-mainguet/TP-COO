import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EssaiPlateau {
	public static void main(String[] args) {
		int rouge = 0;
		int bleu = 0;
		int vert = 0;
		int jaune = 0;
		Random r = new Random();
		String[] gifs = { "images/un.gif", "images/deux.gif",
				"images/trois.gif", "images/quatres.gif" };
		int taille = 10;
		Plateau grille = new Plateau(gifs, taille);
		int[][] jeu = new int[taille][taille];
		List<Integer> liste = new ArrayList<>();
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				jeu[i][j] = r.nextInt(gifs.length + 1);
				liste.add(jeu[i][j]);
			}
		}
		for (Iterator<Integer> ite = liste.iterator(); ite.hasNext();) {
			if (ite.next() == 1) {
				rouge++;
			}if (ite.next() == 2) {
				bleu++;
			}if (ite.next() == 3) {
				vert++;
			}if (ite.next() == 4) {
				jaune++;
			}
		}
		grille.setJeu(jeu);
		grille.affichage();
		System.out.println("rouge : " + rouge);
		System.out.println("bleu : " + bleu);
		System.out.println("vert : " + vert);
		System.out.println("jaune : " + jaune);
	}
}
