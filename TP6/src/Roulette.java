import java.util.Random;

public class Roulette {
	private Random rd = new Random();
	private int bille;
	
	public Roulette(){
		this.bille = this.rd.nextInt(37);
	}
	
	public String lancer(){
		String res = "Rien ne va plus : " + bille;
		if (bille == 0){
			res = res + " - Vert - ";
		}else{
			if (estRouge(bille)){
				res = res + " - Rouge - ";
			}else{
				res = res + " - Noir - ";
			}
		}
		if (bille % 2 == 0){
			res = res + " Pair ";
		}else{
			res = res + " Impair ";
		}
		if (bille >= 1 && bille <= 18){
			res = res + "et Manque";
		}else if (bille > 18){
			res = res + "et Passe";
		}
		return res;
	}
	
	private boolean estRouge(int j){
		int [] rouge = new int []{1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
		for (int i = 0; i < rouge.length; i++){
			if (j == rouge[i]){
				return true;
			}
		}
		return false;
	}
}
