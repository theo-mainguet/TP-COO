package personnages.simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import personnages.abstrait.Vivant;
import personnages.affichage.Afficheur;
import personnages.affichage.Parametres;
import personnages.concret.Elfe;
import personnages.concret.Guerrier;
import personnages.concret.Mage;

public class SimulationPeuples {
	//ArrayList[] equipes = new ArrayList[Parametres.nbPeuples];
	
	Guerrier[] g = new Guerrier[2];
	Mage[] m = new Mage[2];
	Elfe[] e = new Elfe[2];
			
	
	private int nbPeuples,nbIndividus,nbArmes,nbElements;
	private Random r = new Random();
	
	@SuppressWarnings("unchecked")
	public SimulationPeuples(){
		
		for(int i=0; i<2; i++)
			g[i] = new Guerrier("Guerrier" + i);
		for(int i=0; i<2; i++)
			m[i] = new Mage("Mage" + i);
		for(int i=0; i<2; i++)
			e[i] = new Elfe("Elfe" + i);
		
	}
	
	
	public void lancer(){
		int tourDe = r.nextInt(2);
		int contre;
		if(tourDe == 0)
			contre=1;
		else 
			contre = 0;

		switch (r.nextInt(3)) {
		case 0: break;
		case 1: break;
		case 2: break;
		default:
			break;
		}

		
		
		if(v2 instanceof Guerrier){
			Guerrier p2 = (Guerrier)v2;
			System.out.println(v1 + " attaque " + p2 );
			v1.attaque(p2);
		}else if (v2 instanceof Mage){
			Mage p2 = (Mage)v2;
			System.out.println(v1 + " attaque " + p2 );
			v1.attaque(p2);
		}else{
			Elfe p2 = (Elfe)v2;
			System.out.println(v1 + " attaque " + p2 );
			v1.attaque(p2);
		}
			
		
		
	}
	
	
	public void lancer(Afficheur a){
		
	}
}
