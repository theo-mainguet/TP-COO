import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Pacman extends JFrame {
	private int cpt = 0;
	private Color couleur1, couleur2;

	public Pacman(String titre,int x,int y, int largeur,int hauteur) {		
		super(titre);
		this.setSize( largeur, hauteur );
		this.setVisible( true );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		this.setLocation(x,y);
		this.couleur1 = Color.BLACK;
		this.couleur2 = Color.LIGHT_GRAY;
	}
					
	public void animer (int nbr_mouvement){		
		for (cpt=0; cpt<nbr_mouvement; cpt++) {				
			this.repaint();			
			try { Thread.sleep(1000l); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
		
	public void paint (Graphics g){		
		Color tmp;
		if (cpt%4==0){
			tmp = couleur1;
			couleur1 = couleur2; 
			couleur2 = tmp; 			
		}
		g.setColor( couleur2);
		g.fillArc(70, 60, 50, 50, 45-90, 90*(cpt%4));		
	}
	
	public static void main(String[] args) {		
		 new Animation("Quart", 150, 150,200,150).animer(16);
	}
}
