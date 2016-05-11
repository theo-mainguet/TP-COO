
import javax.swing.JOptionPane;

import taupes.actions.Action;
import taupes.actions.Creuser;
import taupes.actions.Deplacer;
import taupes.actions.PoserTas;
import taupes.parcelles.Taupe;
import taupes.terrain.Coordonnees;
import taupes.terrain.Terrain;
import taupes.terrain.Vue;

public class EssaiTaupes {

	public static void main(String[] args) {
		Terrain terrain=new Terrain(10);
		Vue vue1= new Vue(terrain);
		Vue vue2= new Vue(terrain);
		Taupe taupe1=new Taupe (1,vue1,2,2);
		Taupe taupe2=new Taupe (2,vue2,5,5);
		Action action=null;
		int idxAction=0,idxDirection=0,arret=0;
		String reponse;
		
		// taupe humain
		while (!(Terrain.fin || idxAction==3)){	
			arret=-1;
			reponse=JOptionPane.showInputDialog("Choix de l'action :\n0 : Déplacer,\n1 : Faire un Tas,\n2 : Creuser un Trou,\n3 : Arrêter", 0); 	
			while(arret==-1){
				switch (reponse){
					case "0":case "1": case "2":case "3": idxAction=arret=new Integer(reponse);break;
					default: reponse=JOptionPane.showInputDialog("ERREUR : Choisir entre :\n0 : Déplacer,\n1 : Faire un Tas,\n2 : Creuser un Trou,\n3 : Arrêter", 0);break; 
				}
			}
			if (idxAction!=3) {
				arret=-1;
				reponse=JOptionPane.showInputDialog("Choix de la direction :\n0 : HAUT,\n1 : BAS,\n2 : DROITE,\n3 : GAUCHE", 0); 	
				while(arret==-1){
					switch (reponse){
						case "0":case "1": case "2":case "3": idxDirection=arret=new Integer(reponse);break;
						default: reponse=JOptionPane.showInputDialog("ERREUR : Choisir entre :\n0 : HAUT,\n1 : BAS,\n2 : DROITE,\n3 : GAUCHE", 0);break; 
					}
				}
				switch (idxAction){
					case 0: action=new Deplacer(taupe1,idxDirection); break;
					case 1: action=new PoserTas(taupe1,idxDirection); break;
					case 2: action=new Creuser(taupe1,idxDirection); break; 
				}
				if(action!=null && action.getCoordonnees() !=null) action.agit();

				action=null;
				terrain.repaint();
				try { Thread.sleep(2000); } 
				catch (InterruptedException e) { e.printStackTrace(); }

				// Taupe ordinateur
				if (!Terrain.fin && idxAction!=3) {
					idxAction=(int)(Math.random()*3);
					idxDirection=(int)(Math.random()*3);
					switch (idxAction){ 
						case 0: action=new Deplacer(taupe2,idxDirection); break;
						case 1: action=new PoserTas(taupe2,idxDirection); break;
						case 2: action=new Creuser(taupe2,idxDirection); break;
						default: System.out.println(idxAction+"i--- j"+idxDirection); 
					}
					if(action!=null && action.getCoordonnees() !=null) action.agit();
					action=null;
					terrain.repaint();
					try { Thread.sleep(2000); } 
					catch (InterruptedException e) { e.printStackTrace(); }

				}
			}			
		}
		System.exit(0);
	}
}