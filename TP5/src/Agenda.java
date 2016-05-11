import java.util.ArrayList;
public class Agenda{

    ArrayList <Evenement> agenda = new ArrayList <> ();
    boolean entrable(Evenement evenement){
	for (Evenement comp : agenda){
	    if (comp.chevauche(evenement)){
		return false;
	    }
	}
	return true;
    }

    public String toString(){
	return agenda.toString();
    }

    public void entrerEvenement(Evenement evenement){
	agenda.add(evenement);
    }

    public void supprimerEvenement(Evenement evenement){
	agenda.remove(evenement);
    }

    public void supprimerEvenement(int indice){
	agenda.remove(indice);
    }

 void supprimerChevauchement(Evenement evenement){
	for(Evenement even : agenda){
	    if(even.chevauche(evenement)){
		agenda.remove(even);
	    }

	}
    }
}
