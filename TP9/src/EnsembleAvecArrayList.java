import java.util.ArrayList;
import java.util.List;

public class EnsembleAvecArrayList {

	private List<Integer> liste;
	private int max;

	public EnsembleAvecArrayList(int max) {
		liste = new ArrayList<Integer>(max);
		this.max = max;
	}

	public boolean add(Integer i) {
		if (this.liste.contains(i) == false && i < this.max) {
			this.liste.add(i);
			boolean permut = false;
			do {
				permut = false;
				for (int j = 0; j < this.liste.size()-1; j++) {
					if (this.liste.get(j) > this.liste.get(j + 1)) {
						Integer tmp = this.liste.get(j);
						this.liste.set(j, this.liste.get(j + 1));
						this.liste.set(j + 1, tmp);
						permut = true;
					}
				}
			} while (permut);
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return this.liste.size() == 0;
	}

	public void clear() {
		this.liste.clear();
	}

	public boolean remove(Integer i) {
		if (this.liste.contains(i)) {
			this.liste.remove(i);
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String res = "{";
		for (Integer i : liste) {
			if (res.equals("{")) {
				res += i;
			} else {
				res += "," + i;
			}
		}
		return res + "}";
	}

	public boolean contains(Integer i) {
		return this.liste.contains(i);
	}

	public int size() {
		return this.liste.size();
	}

	public static void main(String[] args) {
		EnsembleAvecArrayList test = new EnsembleAvecArrayList(100);
		test.add(33);
		test.add(7);
		test.add(45);
		System.out.println(test.toString().equals("{7,33,45}"));
	}
}
