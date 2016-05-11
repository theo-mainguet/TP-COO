import java.util.*;
public class Evenement{
    
    String intitule;
    String lieu;
    GregorianCalendar debut;
    GregorianCalendar fin;

    Evenement(){}
    Evenement(String i, String l, GregorianCalendar d, GregorianCalendar f){
	this.intitule = i;
	this.lieu = l;
	if (f.compareTo(d) > 0){
	    this.debut = d;
	    this.fin = f;
	}else{
	    this.debut = d;
	    this.fin = d;
	}
    }

    public String toString(){
	return "Intitulé : " + intitule + ", Lieu : " + lieu + ", Début : " + debut.get(Calendar.DAY_OF_MONTH)+"/"+debut.get(Calendar.MONTH)+"/"+debut.get(Calendar.YEAR) + ", Fin : " + fin.get(Calendar.DAY_OF_MONTH)+"/"+fin.get(Calendar.MONTH)+"/"+fin.get(Calendar.YEAR);
    }

    public boolean equals(Evenement evenement){
	if (this.intitule.equals(evenement.intitule) && this.lieu.equals(evenement.lieu) && this.debut.compareTo(evenement.debut) == 0 && this.fin.compareTo(evenement.fin) == 0){
	    return true;
	}else{
	    return false;
	}
    }
    
    public boolean chevauche(Evenement evenement){
	if(this.fin.compareTo(evenement.debut) > 0 || this.debut.compareTo(evenement.fin) < 0){
	    return true;
	}else{
	    return false;
	}
    }
}
