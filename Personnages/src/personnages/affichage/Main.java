package personnages.affichage;

import personnages.simulation.SimulationPeuple;

public class Main {
	public static String[][] tab = {{"../images/f.feu.png","../images/f.arc.png", "../images/f.hache.png"},
		{"../images/h.arc.png","../images/h.air","../images/h.terre.png"}};
	public static int[][] pos = new int[2][3];
	public SimulationPeuple simulation;
	public static Afficheur afficheur = new Afficheur("Jeu", tab, pos);

	public Main() {
	}
	
	public static void main(String[] args) {
		SimulationPeuple simu = new SimulationPeuple();
		simu.lancer(afficheur);
	}
}
