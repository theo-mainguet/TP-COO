import javax.swing.*;
import java.lang.*;
public class Saisie{
    
    public static void main (String [] args){
	String res = "";
	if (args.length == 2){
	    if (!args[0].matches("\\d+") || !args[1].matches("\\d+")){
		JOptionPane.showMessageDialog(null,"Veuillez entrer deux entiers.");
	    }else{
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int entier;
		do{
		    do{
			res = JOptionPane.showInputDialog(null,"Entrez un nombre compris entre " + args[0] + " et " + args[1] + " :");
		    }while (!res.matches("\\d+"));
		    entier = Integer.parseInt(res);
		}while (entier < min || entier > max);
	    }
	}else{
	   JOptionPane.showMessageDialog(null,"Veuillez entrer deux parametres."); 
	}
	JOptionPane.showMessageDialog(null,"Vous avez choisi : " + res);
    }
}
