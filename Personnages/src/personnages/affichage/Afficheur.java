package personnages.affichage;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Afficheur extends JPanel{
	
	private int largeurNiveau;
	private ImageIcon[][] images;
	private int hauteurImage;
	private int largeurImage;
	private int [][] niveaux;
	private int lignes;
	private int colonnes;
	
	public Afficheur(String nom, String [][] icons, int [][] position){
		JFrame fenetre = new JFrame(nom);
		fenetre.setPreferredSize(new Dimension(600, 400));
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.getContentPane().add(this);
		fenetre.pack();
		fenetre.setVisible(true);
		images = new ImageIcon[icons.length][icons[0].length];
		for (int i = 0; i < icons.length; i++){
			for (int j = 0; j < icons[0].length; j++){
				images[i][j] = new ImageIcon(icons[i][j]);
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		System.out.println(".");
		for (int i = 0; i < images.length; i++){
			for (int j = 0; j < images[0].length; j++){
				g.drawImage(images[i][j].getImage(), i,j,null);
			}
		}
	}	
}
