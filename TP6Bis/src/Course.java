import java.util.Random;

public class Course {
	public static Random rd = new Random();

	public static void main(String[] args) {
		String[] gifs = new String[] { "images/un.gif", "images/deux.gif" };
		int taille = 10;
		SuperPlateau plateau = new SuperPlateau(gifs, taille);
		int[][] jeu = plateau.getJeu();
		jeu[0][0] = 1;
		jeu[0][1] = 2;
		plateau.setJeu(jeu);
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 1;
		int cpt = 0;
		while ((x < jeu[0].length - 1 || y < jeu.length - 1) && (a < jeu[0].length - 1 || b < jeu.length - 1)) {
			int choix = rd.nextInt(3);
			int joueurC = cpt%2;
			if (joueurC == 0) {
				if (choix == 0) {
					// EST
					if (x != jeu[0].length - 1) {
						if (plateau.deplacer(x, y, x + 1, y)) {
							x += 1;
							plateau.affichage();
						}
					}
				} else if (choix == 1) {
					// SUD
					if (y != jeu.length - 1) {
						if (plateau.deplacer(x, y, x, y + 1)) {
							y += 1;
							plateau.affichage();
						}
					}
				} else {
					// SUD EST
					if (y != jeu.length - 1 && x != jeu[0].length - 1) {
						if (plateau.deplacer(x, y, x + 1, y + 1)) {
							x += 1;
							y += 1;
							plateau.affichage();
						}
					}
				}
			} else {
				if (choix == 0) {
					// EST
					if (a != jeu[0].length - 1) {
						if (plateau.deplacer(a, b, a + 1, b)) {
							a += 1;
							plateau.affichage();
						}
					}
				} else if (choix == 1) {
					// SUD
					if (b != jeu.length - 1) {
						if (plateau.deplacer(a, b, a, b + 1)) {
							b += 1;
							plateau.affichage();
						}
					}
				} else {
					// SUD EST
					if (a != jeu.length - 1 && b != jeu[0].length - 1) {
						if (plateau.deplacer(a, b, a + 1, b + 1)) {
							a += 1;
							b += 1;
							plateau.affichage();
						}
					}
				}
			}
			cpt++;
			System.out.println("Joueur " + joueurC + " choix " + choix);
		}
	}
}
