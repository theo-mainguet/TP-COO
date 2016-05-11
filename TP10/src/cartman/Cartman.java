package cartman;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Cartman extends JFrame{
	
	private static final long serialVersionUID = 7770051128466852412L;

	public Cartman(String titre, int x,int y, int largeur,int hauteur) {
		super(titre);						//titre de la fenêtre
		this.setLocation(x,y); 				//position de la fenêtre
		this.setSize( largeur, hauteur ); 	//taille de la fenêtre
		this.setVisible( true );			// rend visible l'objet	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture automatique	
	}
	
	public void paint (Graphics g){	
		int [] pointX = new int [] {245,275,470,500};
		int [] pointY = new int [] {410,475,475,410};
		
		g.setColor(Color.RED);
		g.fillOval(222, 200, 300, 275);
		
		g.setColor(new Color(174,100,45));
		g.fillPolygon(pointX, pointY, 4);
	
		g.setColor( new Color(255,228,196) );		
		g.fillOval( 235, 100, 275, 215 ); 	

		g.setColor( Color.YELLOW );  	
		g.fillOval( 175, 350, 80, 50 );  
		
		g.setColor( Color.YELLOW );  	
		g.fillOval( 475, 350, 80, 50 );
		
		g.setColor(Color.WHITE);	
		g.fillOval(320, 160, 50, 80);
		g.fillOval(380, 160, 50, 80);
		
		g.setColor(Color.BLACK);
		g.fillOval(340, 195, 15, 15);
		g.fillOval(397, 195, 15, 15);
		
		g.fillOval(278, 462, 90, 25);
		g.fillOval(378,462,90,25);
		
		g.setColor(Color.decode("#eeeeee"));
		g.fillRect(275,475,300,300);
	}
	
	public static void main(String[] args) {	
		new Cartman("Cartman",200,150,750,750);				
	}	
}
