public class EssaiString {

    public static void main (String [] args){
	String parametres = "";
	for (int i = 0; i < args.length; i++){
	    if (i == 0){
		parametres = args[i];
	    }else{
		parametres = parametres + ";" + args[i];
	    }
	}
	System.out.println(parametres);

	for (int i = 0; i < args.length; i++){
	    if (i == 0){
		parametres = args[i];
	    }else{
		parametres = parametres + ";" + args[i];
	    }
	}
	System.out.println(parametres.toLowerCase());

	System.out.println("Longueur : " + parametres.length());
	
	String res = "";
	for (int i = 0; i < args.length; i++){
	    if (args[i].contains(".")){
		res = res + args[i] + " ";
	    }
	}
	System.out.println("Parametres avec un . : " + res);

	
    }
}
