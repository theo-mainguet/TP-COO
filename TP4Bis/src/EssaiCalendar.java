import java.util.*;
public class EssaiCalendar{
    public static void main (String [] args){
	/*
	//Q1
	GregorianCalendar date = new GregorianCalendar();
	System.out.println(date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR));
	
	//Q2
	Random rd = new Random();
	date.set(1990,11,rd.nextInt(31)+1);
	System.out.println(date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR));
	date.set(2010,0,rd.nextInt(31)+1);
	System.out.println(date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR));

	//Q3
	int mois;
	int jour;
	GregorianCalendar date1 = new GregorianCalendar();
	GregorianCalendar date2 = new GregorianCalendar();
	mois = rd.nextInt(11)+1;
	if (mois % 2 == 0){
	    jour = rd.nextInt(30)+1;
	}else{
	    if (mois == 1){
		jour = rd.nextInt(29)+1;
	    }else{
		jour = rd.nextInt(31)+1;
	    }
	}
	date1.set(2016,mois,jour);
	System.out.println(date1.get(Calendar.DAY_OF_MONTH)+"/"+date1.get(Calendar.MONTH)+"/"+date1.get(Calendar.YEAR));

	mois = rd.nextInt(11)+1;
	if (mois % 2 == 0){
	    jour = rd.nextInt(30)+1;
	}else{
	    if (mois == 1){
		jour = rd.nextInt(29)+1;
	    }else{
		jour = rd.nextInt(31)+1;
	    }
	}
	date2.set(2016,mois,jour);
	System.out.println(date2.get(Calendar.DAY_OF_MONTH)+"/"+date2.get(Calendar.MONTH)+"/"+date2.get(Calendar.YEAR));
    
	//Q4
	if (date1.compareTo(date2) == 1){
	    System.out.println(date1 + " > " + date2);
	}else{
	    System.out.println(date1 + " < " + date2);
	}
	*/

	//Q5
	/** La date du départ*/
	Date date1 = new GregorianCalendar(2016,11,31,17,06).getTime( );
	
	/** Date du jour */
	Date today = new Date( );
	
	// Calcul de différence
	long diff = today.getTime( ) - date1.getTime( );
 
	System.out.println("Différence en nombre de jour entre "+date1+ " et " + today +
			   " nest " + (diff / (1000*60*60*24)) + " jours.");
    }
}

