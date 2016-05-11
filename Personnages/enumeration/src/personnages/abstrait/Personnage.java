package personnages.abstrait;

public abstract class Personnage implements Vivant {
	
	private String nom;
	private int vie;
	private int force;
	private static int nbPersonnage;
	private int numeroPersonnage;

	
	public String getNom(){return nom;}
	public int getVie(){return vie;}
	@Override
	public int getForce() {return force;}
	public void setForce(int force){this.force = force;}
	
	public Personnage(){
		force = 10;
		vie = 100;
	}
	public Personnage(String nom){
		this();
		this.nom = nom;
	}
	
	@Override
	public void attaque(Vivant v) {
		force++;
		v.subitAttaque(this);
	}

	@Override
	public void subitAttaque(Vivant v) {
		vie -= v.getForce();
	}

	@Override
	public void perte(int i) {
		vie -= i;
	}

	@Override
	public boolean estVivant() {return vie > 0;}
	
	public String toString(){
		return null;
	}

}
