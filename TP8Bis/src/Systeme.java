
public class Systeme {

	public static void main(String[] args) {
		OrdoAvecPriorite liste = new OrdoAvecPriorite();
		ProcessusAfficheur affi = new ProcessusAfficheur("afficheur");
		ProcessusBoucleur bouc = new ProcessusBoucleur("boucleur");
		ProcessusLectureEcriture ecrilec = new ProcessusLectureEcriture();
		liste.ajouteObjet(affi);
		liste.ajouteObjet(bouc);
		liste.ajouteObjet(ecrilec);
		while(!liste.estVide()){
			Prioritaire prio = liste.plusPrioritaire();
			Processus proc = (Processus)prio;
			proc.execute();
			if (!proc.estFini()){
				liste.ajouteObjet(prio);
			}
		}
	}
}
