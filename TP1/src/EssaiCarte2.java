import java.util.Random;
public class EssaiCarte2{
    
    public static void main (String[] args){
	Random rd = new Random();
	Carte c1 = new Carte(rd.nextInt(4), rd.nextInt(8));
	Carte c2 = new Carte(rd.nextInt(4), rd.nextInt(8));
	if (c1.precede(c2)){
	    System.out.println(c1.toString() + " precede " + c2.toString());
	}else{
	    System.out.println(c2.toString() + " precede " + c1.toString());
	}
    }
}
