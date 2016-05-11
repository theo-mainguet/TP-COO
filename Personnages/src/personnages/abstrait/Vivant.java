package personnages.abstrait;

import java.util.Random;

public interface Vivant {
	public static final Random ALEA = new Random();
	
	public void attaque (Vivant vivant);
	public void subitAttaque (Vivant vivant);
	public void perte (int degat);
	public int getForce ();
	public boolean estVivant ();
}
