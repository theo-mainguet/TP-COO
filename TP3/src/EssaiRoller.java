public class EssaiRoller {

    public static void main (String [] args){
	Inscrit [] inscrits = new Inscrit [6];
	inscrits[0] = new Inscrit(1,45,15,20);
	inscrits[1] = new Inscrit(2,32,12,45);
	inscrits[2] = new Inscrit(5,12,13,59);
	inscrits[3] = new Inscrit(12,12,15,70);
	inscrits[4] = new Inscrit(32,75,15,20);
	inscrits[5] = new Inscrit(112,75,15,20);
	int id = 0;
	Inscrit [] valide = new Inscrit [inscrits.length];
	for (int i = 0; i < inscrits.length; i++){
	    if (inscrits[i].dossard != null){
		valide[id] = inscrits[i];
		System.out.println(valide[id].toString());
		id = id + 1;
	    }
	}
    }
}
	
