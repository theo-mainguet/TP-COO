public class EnsembleAvecBooleen {
	private boolean[] tab;

	public EnsembleAvecBooleen(Integer max) {
		this.tab = new boolean[max];
		for (int i = 0; i < this.tab.length; i++) {
			this.tab[i] = false;
		}
	}

	public boolean add(Integer i) {
		if (i < this.tab.length) {
			this.tab[i] = true;
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		for (int i = 0; i < this.tab.length; i++) {
			if (this.tab[i] == true) {
				return false;
			}
		}
		return true;
	}

	public void clear() {
		for (int i = 0; i < this.tab.length; i++) {
			this.tab[i] = false;
		}
	}

	public boolean remove(Integer i) {
		if (i < this.tab.length && tab[i]) {
			this.tab[i] = false;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String res = "{";
		for (int i = 0; i < this.tab.length; i++) {
			if (tab[i] == true) {
				if (res.equals("{")){
					res += i;
				}else{
					res += "," + i;
				}
			}
		}
		return res + "}";
	}

	public boolean contains(Integer i) {
		if (i < this.tab.length && tab[i]) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int cpt = 0;
		for (int i = 0; i < this.tab.length; i++){
			if (tab[i]){
				cpt++;
			}
		}
		return cpt;
	}

	public static void main(String[] args) {
		EnsembleAvecBooleen test = new EnsembleAvecBooleen(15);
		test.add(5);
		test.add(8);
		System.out.println(test.toString());
	}
}
