
public class main {
	public static void main(String[] args){
		Poste poste = new Poste("Justin Bridou");
		Piece ecran = new Piece(1340, "Ecran");
		Piece clavier = new Piece(1934, "Clavier");
		Piece souris = new Piece(2805, "Souris");
		Element uniteCentrale = new Element("Unité Centrale");
		Piece carteMere = new Piece(1569, "Carte Mère");
		Piece extensionMemoire = new Piece(289, "Extension mémoire");
		Piece disqueSCSI = new Piece(289, "Disque SCSI");
		Element carteGraphique = new Element ("Carte Graphique");
		Piece processGraph = new Piece (7289, "Processeur Graphique");
		Piece extensionMemoire2 = new Piece (2879, "Extension mémoire");
		carteGraphique.addAssemblable(processGraph);
		carteGraphique.addAssemblable(extensionMemoire2);
		uniteCentrale.addAssemblable(carteMere);
		uniteCentrale.addAssemblable(extensionMemoire);
		uniteCentrale.addAssemblable(disqueSCSI);
		uniteCentrale.addAssemblable(carteGraphique);
		poste.addAssemblable(ecran);
		poste.addAssemblable(clavier);
		poste.addAssemblable(souris);
		poste.addAssemblable(uniteCentrale);
		System.out.println(extensionMemoire.listeAssemblage());
	}
}
