import java.util.*;
public class SuperPlateau implements Iterator<Integer>{
	private Plateau plateau;
	int idx, idy;
	int[][] tab = plateau.getJeu();
	
	SuperPlateau(String[] gifs,int taille){
		plateau = new Plateau(gifs,taille);
	}
	
	public void affichage(){
		plateau.affichage();
	}
	
	public int [][] getJeu(){
		return plateau.getJeu();
	}
	
	public void paintComponent(java.awt.Graphics g){
		plateau.paintComponent(g);
	}
	
	public void setJeu(int[][] jeu){
		plateau.setJeu(jeu);
	}
	
	public boolean deplacer(int x, int y, int a, int b){
		int[][] jeu = plateau.getJeu();
		try{Thread.sleep(1000);}catch(Exception ie){};
		int tmp = 0;
		if (jeu[a][b] == 0){
			tmp = jeu[x][y];
			jeu[x][y] = jeu [a][b];
			jeu[a][b] = tmp;
			plateau.setJeu(jeu);
			return true;
		}else{
			return false;
		}
	}

	public boolean hasNext() {
		if (idy == this.tab[0].length - 1 && idx == this.tab.length - 1) {
			return false;
		} else {
			return true;
		}
	}

	public Integer next() {if (hasNext()) {
		if (idx + 1 >= this.tab.length - 1 && idy < this.tab[0].length - 1) {
			idy++;
			idx = 0;
			return this.tab[idx][idy];
		} else {
			return this.tab[idx + 1][idy];
		}
	} else {
		return null;
	}
	}

	public void remove() {
	}
	
	public Iterator<Integer> toIterator() {
		List<Integer> liste = new ArrayList<>();
		for (int i = 0; i < this.tab.length; i++) {
			for (int j = 0; j < this.tab[0].length; j++) {
				Integer tmp = this.tab[i][j];
				liste.add(tmp);
			}
		}
		Iterator<Integer> i = liste.iterator();
		return i;
	}
}
