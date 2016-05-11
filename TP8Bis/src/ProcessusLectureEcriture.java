import javax.swing.JOptionPane;

public class ProcessusLectureEcriture implements Processus, Prioritaire {

	private String mess;
	private int priorite;
	private int nbFois;
	private int nb;

	public ProcessusLectureEcriture() {
		this.mess = "";
		this.priorite = 1;
		this.nbFois = 2;
		this.nb = 0;
	}

	public int getPriorite() {
		return this.priorite;
	}

	public void execute() {
		for (; nb < nbFois; nb++) {
			if (nb % 2 == 0) {
				this.mess = JOptionPane.showInputDialog(null,
						"Entrez une chaîne :");
			} else {
				JOptionPane.showMessageDialog(null, "Chaîne : " + this.mess);
			}
		}
	}

	public boolean estFini() {
		return true;
	}
	
	public static void main(String[] args) {
		ProcessusLectureEcriture test = new ProcessusLectureEcriture();
		test.execute();
	}
}
