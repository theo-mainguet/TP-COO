package personnages.simulation;

import java.util.Random;

import personnages.affichage.Afficheur;
import personnages.affichage.Parametres;
import personnages.concret.Arme;
import personnages.concret.Element;

public class SimulationPeuple {

	private int nbPeuples;
	private int nbIndividus;
	private int nbArmes;
	private int nbElements;
	private Random r;
	
	public SimulationPeuple(){
		this.nbPeuples = Parametres.nbPeuples;
		this.nbIndividus = Parametres.nbPersonnages;
		this.nbArmes = Arme.values().length;
		this.nbElements = Element.values().length;
	}
	
	public void lancer(Afficheur afficheur){
		
	}
}
