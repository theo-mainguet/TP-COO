package taupes.terrain;
import java.util.*;
/**
 * La classe Constrante fournit des constantes pour représenter les 4 directions
 * @author M2103
 *
 */
public class Constante {
	
	/**
	 * Direction de l'action : haut
	 */
	public final static Coordonnees HAUT=new Coordonnees(0,-1);
	
	/**
	 * Direction de l'action : bas
	 */
	public final static Coordonnees BAS=new Coordonnees(0,1);
	
	/**
	 * Direction de l'action : droite
	 */
	public final static Coordonnees DROITE=new Coordonnees(1,0);
	
	/**
	 * Direction de l'action : gauche
	 */
	public final static Coordonnees GAUCHE=new Coordonnees(-1,0);
	
	/**
	 * Liste des directions
	 */
	public static List<Coordonnees> dep;
	static{
		dep=new ArrayList<Coordonnees>(4);
		dep.add(HAUT);
		dep.add(BAS);
		dep.add(DROITE);
		dep.add(GAUCHE);
	}
}
