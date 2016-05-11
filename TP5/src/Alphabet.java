import java.util.ArrayList;
public class Alphabet {

    static ArrayList <Character> alphabet = new ArrayList<>();
    public static void main (String[] args){
	for (int i = 0; i < 26; i++){
	    alphabet.add((char)((int)'A'+i));
	}
	System.out.println(alphabet.size());
	System.out.println(alphabet.get(4));
	System.out.println(alphabet.indexOf('S'));
	for (int i = 4; i < 7; i++){
	    alphabet.remove(4);
	}
	System.out.println(alphabet);
	for (Character mot : alphabet){
	    System.out.print(mot + ", ");
	}
	System.out.println();
	// alphabet.add(100, '?'); ERREUR
	alphabet.clear();
	System.out.println(alphabet);
    }
}
