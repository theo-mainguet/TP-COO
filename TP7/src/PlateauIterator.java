import java.util.*;

public class PlateauIterator implements Iterator<Integer> {
	int[][] tab;
	int idx, idy;

	public PlateauIterator(int[][] tab) {
		this.tab = tab;
	}

	public boolean hasNext() {
		if (idy == this.tab[0].length - 1 && idx == this.tab.length - 1) {
			return false;
		} else {
			return true;
		}
	}

	public Integer next() {
		if (hasNext()) {
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
