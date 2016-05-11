
public class ProcessusAfficheur implements Processus, Prioritaire {

	private String mess;
	private int nbFois;
	private int nb;
	private int priorite;
	
	public ProcessusAfficheur(){
		this.nbFois = 1;
		this.nb = 0;
		this.priorite = 3;
		this.mess = "";
	}

	public ProcessusAfficheur(String m){
		this.mess = m;
		this.nbFois = 1;
		this.nb = 0;
		this.priorite = 3;
	}
	
	public int getPriorite() {
		return priorite;
	}

	public void execute() {
		this.nb++;
		System.out.println(mess);
	}

	public boolean estFini() {
		return nb == nbFois;
	}

}
