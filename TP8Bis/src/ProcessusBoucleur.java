
public class ProcessusBoucleur implements Processus, Prioritaire{

	private String mess;
	private int nbFois;
	private int nb;
	private int priorite;
	
	public ProcessusBoucleur(){
		this.nbFois = 3;
		this.nb = 0;
		this.priorite = 2;
		this.mess = "";
	}

	public ProcessusBoucleur(String m){
		this.mess = m;
		this.nbFois = 3;
		this.nb = 0;
		this.priorite = 2;
	}
	
	public int getPriorite() {
		return priorite;
	}

	public void execute() {
		for (;nb < nbFois; nb++){
			System.out.println(mess);
		}
	}

	public boolean estFini() {
		return nb == nbFois;
	}

}