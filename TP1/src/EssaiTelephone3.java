import java.util.Random;
import java.lang.Integer;
public class EssaiTelephone3 {

    public static void main (String[] args){
	Random rd = new Random();
	for (int i = 0; i < Integer.parseInt(args[0]); i++){
	    Telephone t = new Telephone (rd.nextInt(9) + 1, rd.nextInt(100), rd.nextInt(100), rd.nextInt(100), rd.nextInt(100));
	    System.out.println(t.toString());
	}
    }
}
