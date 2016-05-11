

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Exemple extends JFrame{	
	
	public Exemple(String titre, int x,int y, int largeur,int hauteur) {
		super(titre);						//titre de la fenêtre
		this.setLocation(x,y); 				//position de la fenêtre
		this.setSize( largeur, hauteur ); 	//taille de la fenêtre
		this.setVisible( true );			// rend visible l'objet	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture automatique	
	}
	
	public void paint (Graphics g){		
		g.setColor( Color.GREEN );		// fixe la couleur courante
		g.fillRect( 50, 60, 90, 55 ); 	// dessine un rectangle plein
				
		g.setColor( Color.BLACK );  	// modifie la couleur courante
		g.drawOval( 55, 70, 80, 35 );   // dessine un oval en mode filaire
	}
	
	public static void main(String[] args) {	
		new Exemple("Oh!",300,160,200,150);				
	}	
}
