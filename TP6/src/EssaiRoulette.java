import javax.swing.JOptionPane;


public class EssaiRoulette {
	
	public static void main (String[] args){
		for (int i = 0; i < 10; i++){
			Roulette r = new Roulette();
			JOptionPane.showMessageDialog(null, r.lancer());
		}
	}
}
