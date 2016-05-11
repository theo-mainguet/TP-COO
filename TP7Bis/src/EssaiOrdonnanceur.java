public class EssaiOrdonnanceur {
	public static void main(String[] args) {
		OrdoFile file = new OrdoFile();
		Prioritaire t1 = new Tache ("poo",1);
		Prioritaire t2 = new Tache ("ap",0);
		Prioritaire t3 = new Tache ("bdd",2);
		Prioritaire t4 = new Tache ("analyse",0);
		file.ajouteObjet(t1);
		file.ajouteObjet(t2);
		file.ajouteObjet(t3);
		file.ajouteObjet(t4);
		for (Prioritaire p : file.liste){
			System.out.println(p.toString());
		}
	}
}