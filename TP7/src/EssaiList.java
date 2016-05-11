import java.util.*;

public class EssaiList {
	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Robin");
		liste.add("Romain");
		liste.add("Alexandre");
		for (Iterator<String> iterator = liste.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
