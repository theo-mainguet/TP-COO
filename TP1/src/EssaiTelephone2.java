import java.util.Random;
public class EssaiTelephone2 {

    public static void main(String[] args){
	Random rd = new Random();
	for (int i = 0; i < 5; i++){
	    Telephone t = new Telephone (rd.nextInt(9) + 1, rd.nextInt(100), rd.nextInt(100), rd.nextInt(100), rd.nextInt(100));
	    System.out.println(t.toString());
	}
    }
}
