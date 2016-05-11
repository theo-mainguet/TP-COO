import java.util.*;
public class EasyDate{
    
    GregorianCalendar date = new GregorianCalendar();
    
    public String toString(){
	if (date == null){
	    return "Date Incorrecte";
	}else{
	    return ((date.get(Calendar.DAY_OF_MONTH)<9)?"0":"") + date.get(Calendar.DAY_OF_MONTH) + "/" + ((date.get(Calendar.MONTH)<9)?"0":"") + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.YEAR);
	}
    }

    EasyDate(){
	date = new GregorianCalendar();
    }

    EasyDate(int jour, int mois){
	if (mois > 0 && mois < 13 && jour > 0 && jour < 32){
	    date = new GregorianCalendar(date.get(Calendar.YEAR), mois - 1, jour);
	}else{
	    date = new GregorianCalendar();
	}
    }

    EasyDate(int jour, int mois, int annee){
	if (mois > 0 && mois < 13 && jour > 0 && jour < 32){
	    date = new GregorianCalendar(annee, mois - 1, jour);
	}else{
	    date = new GregorianCalendar();
	}
    }

    EasyDate(String date){
	String [] datum = date.split("/");
	if (datum.length == 3){
	    int [] datumInt = new int [datum.length];
	    for (int i = 0; i < datumInt.length; i++){
		datumInt[i] = Integer.parseInt(datum[i]);
	    }
	    if (datumInt[0] > 0 && datumInt[0] < 32 && datumInt[1] > 0 && datumInt[1] < 13 && datum[2].length() == 4){
		this.date = new GregorianCalendar(datumInt[2], datumInt[1]-1, datumInt[0]);
	    }else{
		System.out.println("Parametre incorrecte");
		this.date = null;
	    }
	}else{
	    System.out.println("Parametre incorrecte");
	    this.date = null;
	}
    }

    public boolean equals(GregorianCalendar d){
	if (date == d){
	    return true;
	}else{
	    return false;
	}
    }

    public int compareTo(EasyDate d){
	if (date.getTimeInMillis() > d.date.getTimeInMillis()){
	    return 1;
	}else if (date.getTimeInMillis() < d.date.getTimeInMillis()){
	    return -1;
	}else{
	    return 0;
	}
    }
}
	
