import java.util.Random;

public class Traversee {
	public static Random rd = new Random();

	public static void main(String[] args) {
		String[] gifs = new String[] { "images/un.gif" };
		int taille = 10;
		SuperPlateau plateau = new SuperPlateau(gifs, taille);
		int[][] jeu = plateau.getJeu();
		jeu[0][0] = 1;
		plateau.setJeu(jeu);
		int x = 0;
		int y = 0;
		while (x < jeu[0].length - 1 || y < jeu.length - 1) {
			int choix = rd.nextInt(3);
			if (choix == 0) {
				// EST
				if (x != jeu[0].length - 1) {
					plateau.deplacer(x, y, x+1, y);
					x += 1;
					plateau.affichage();
				}
			} else if (choix == 1) {
				// SUD
				if (y != jeu.length - 1) {
					plateau.deplacer(x, y, x, y+1);
					y += 1;
					plateau.affichage();
				}
			} else {
				// SUD EST
				if (y != jeu.length - 1 && x != jeu[0].length - 1) {
					plateau.deplacer(x, y, x + 1, y + 1);
					x += 1;
					y += 1;
					plateau.affichage();
				}
			}
		}
	}
}
