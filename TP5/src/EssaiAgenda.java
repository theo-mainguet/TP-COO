import java.util.*;
public class EssaiAgenda {
    
    public static void main (String [] args){
	Agenda agenda = new Agenda ();
	Evenement e1 = new Evenement("Anniv Maite", "Neuville", new GregorianCalendar(2016,7,2), new GregorianCalendar(2016,7,2));
	Evenement e2 = new Evenement("Anniv Aude", "Reims", new GregorianCalendar(2016,3,26), new GregorianCalendar(206,3,26));
	Evenement e3 = new Evenement("Anniv Romain", "Bondues", new GregorianCalendar(2016,7,29), new GregorianCalendar(2016,7,29));
	agenda.entrerEvenement(e1);
	agenda.entrerEvenement(e2);
	agenda.entrerEvenement(e3);
	System.out.println(agenda.toString());
    }
}
