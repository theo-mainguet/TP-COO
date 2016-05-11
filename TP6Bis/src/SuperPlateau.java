
public class SuperPlateau {
	private Plateau plateau;
	
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
}
