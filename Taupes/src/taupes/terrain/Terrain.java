package taupes.terrain;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import taupes.parcelles.Mur;
import taupes.parcelles.Parcelle;
import taupes.parcelles.Taupe;

@SuppressWarnings("serial")
public class Terrain extends JPanel {
	/**
	 * Grille de parcelles
	 */
	private static Parcelle[][] terrain;
	private static Map<String, ImageIcon> images = new HashMap<>();

	/**
	 * taille d'une parcelle
	 */
	private static final int tailleParcelle = new ImageIcon("images/terre.jpg")
			.getIconHeight() + 2;

	/**
	 * taille du territoire
	 */
	private static int tailleTerrain;

	/**
	 * Retourne la taille du terrain
	 * 
	 * @return la taille du terrain
	 */
	public static int getTaille() {
		return tailleTerrain;
	}

	/**
	 * Indicateur de fin de partie
	 */
	public static boolean fin = false;

	/**
	 * Crée une fenêtre et affiche le territoire dedans
	 * 
	 * @param taille
	 *            la taille du territoire
	 */
	public Terrain(int taille) {
		Terrain.tailleTerrain = taille;
		terrain = new Parcelle[tailleTerrain][tailleTerrain];

		// Les images manipulées
		images.put("terre", new ImageIcon("images/terre.jpg"));
		images.put("mur", new ImageIcon("images/mur.jpg"));
		images.put("tas", new ImageIcon("images/tas.jpg"));
		images.put("trou", new ImageIcon("images/trou.jpg"));
		images.put("taupe1", new ImageIcon("images/taupe1.jpg"));
		images.put("taupe2", new ImageIcon("images/taupe2.jpg"));
		// Taille de la fenêtre
		Frame f = new Frame("Terrain");
		f.setBounds(100, 100, tailleParcelle * tailleTerrain + 20,
				tailleParcelle * tailleTerrain + 50);
		f.add(this);
		// Remplissage du terrain
		for (int i = 0; i < tailleTerrain - 1; i++) {
			// Pose des murs
			terrain[i][0] = new Mur(i, 0);
			terrain[0][i] = new Mur(0, i);
			terrain[i][tailleTerrain - 1] = new Mur(i, tailleTerrain - 1);
			terrain[tailleTerrain - 1][i] = new Mur(tailleTerrain - 1, i);
			// parcelles de terrain
			for (int j = 1; j < tailleTerrain - 1; j++)
				terrain[i][j] = new Parcelle(i, j);
		}
		terrain[tailleTerrain - 1][tailleTerrain - 1] = new Mur(
				tailleTerrain - 1, tailleTerrain - 1);

		// Fermeture de la fenêtre
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// Affichage de la fenêtre
		f.setVisible(true);
	}

	/**
	 * Teste si la parcelle (x,y) est un mur
	 * 
	 * @param x
	 *            l'abscisse
	 * @param y
	 *            l'ordonnée
	 * @return vrai si la parcelle contient un mur
	 */
	public boolean estMur(int x, int y) {
		return terrain[x][y].estMur();
	}

	/**
	 * Teste si la parcelle (x,y) est un tas
	 * 
	 * @param x
	 *            l'abscisse
	 * @param y
	 *            l'ordonnée
	 * @return vrai si la parcelle contient un tas
	 */
	public boolean estTas(int x, int y) {
		return terrain[x][y].estTas();
	}

	/**
	 * Teste si la parcelle (x,y) est un trou
	 * 
	 * @param x
	 *            l'abscisse
	 * @param y
	 *            l'ordonnée
	 * @return vrai si la parcelle contient un trou
	 */
	public int estTrou(int x, int y) {
		return terrain[x][y].estTrou();
	}

	/**
	 * Teste si la parcelle (x,y) contient une Taupe
	 * 
	 * @param x
	 *            l'abscisse
	 * @param y
	 *            l'ordonnée
	 * @return vrai si la parcelle contient une taupe
	 */
	public int estTaupe(int x, int y) {
		return terrain[x][y].estTaupe();
	}

	/**
	 * Pose un Tas sur la parcelle (x,y)
	 * 
	 * @param x
	 *            l'abscisse
	 * @param y
	 *            l'ordonnée
	 */
	public void poserTas(int x, int y) {
		if (estTaupe(x, y) != 0) {
			fin = true;
			JOptionPane.showMessageDialog(null, "Partie terminée !!!");
			terrain[x][y].retirerTaupe();
		}
		if (estTrou(x, y) != 0) {
			terrain[x][y].boucherTrou();
		} else {
			terrain[x][y].poserTas();
		}
		repaint();
	}

	/**
	 * Creuse un Trou sur la parcelle (x,y)
	 * 
	 * @param x
	 *            abscisse
	 * @param y
	 *            ordonnée
	 * @param equipe
	 *            l'équipe
	 */
	public void creuserTrou(int x, int y, int equipe) {
		if (!estTas(x, y)) {
			if (estTaupe(x, y) != 0) {
				fin = true;
				JOptionPane.showMessageDialog(null, "Partie terminée !!!");
				terrain[x][y].retirerTaupe();
			}
			terrain[x][y].creuserTrou(equipe);
		} else {
			terrain[x][y].retirerTas();
		}

		repaint();
	}

	/**
	 * Place une Taupe sur la case (x,y)
	 * 
	 * @param x
	 *            abscisse
	 * @param y
	 *            ordonnée
	 * @param taupe
	 *            la taupe
	 */
	public void poserTaupe(int x, int y, Taupe taupe) {
		if (!estTas(x, y) && estTaupe(x, y) == 0)
			terrain[x][y].poserTaupe(taupe);

		if (estTrou(x, y) != 0) {
			int i = estTrou(x, y);
			fin = true;
			JOptionPane.showMessageDialog(null, "Partie terminée !!!");
			terrain[x][y].vider();
			terrain[x][y].creuserTrou(i);
		}
		repaint();
	}

	/**
	 * Libère une parcelle (x,y)
	 * 
	 * @param x
	 *            abscisse
	 * @param y
	 *            ordonnée
	 */
	public void setLibre(int x, int y) {
		terrain[x][y].vider();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#update(java.awt.Graphics)
	 */
	public void update(Graphics g) {
		paint(g);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		for (int x = 0; x < tailleTerrain; x++) {
			for (int y = 0; y < tailleTerrain; y++) {
				if (estMur(x, y)) {
					g.drawImage(images.get("mur").getImage(), x
							* tailleParcelle, y * tailleParcelle, null);
				} else {
					if (estTrou(x, y) != 0) {
						g.drawImage(images.get("trou").getImage(), x
								* tailleParcelle, y * tailleParcelle, null);
					} else if (estTas(x, y)) {
						g.drawImage(images.get("tas").getImage(), x
								* tailleParcelle, y * tailleParcelle, null);
					} else {
						switch (estTaupe(x, y)) {
						case 0: {
							g.drawImage(images.get("terre").getImage(), x
									* tailleParcelle, y * tailleParcelle, null);
							break;
						}
						case 1: {
							g.drawImage(images.get("taupe1").getImage(), x
									* tailleParcelle, y * tailleParcelle, null);
							break;
						}
						case 2: {
							g.drawImage(images.get("taupe2").getImage(), x
									* tailleParcelle, y * tailleParcelle, null);
							break;
						}

						}
					}
				}
			}
		}
	}

}
