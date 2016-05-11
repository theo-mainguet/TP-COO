import java.util.Random;
public class EssaiCarte3{
    
    public static void main (String[] args){
	Random rd = new Random();
	Carte res = new Carte (rd.nextInt(4), rd.nextInt(8));
	Carte c;
	for (int i = 0; i < 9; i++){
	    c = new Carte(rd.nextInt(4), rd.nextInt(8));
	    if (c.compareTo(res) >= 0){
		res = c;
	    }
	}
	System.out.println(res.toString());
    }
}
