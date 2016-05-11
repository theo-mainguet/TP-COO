public class ArticlesAvecPrix {
	private ArticlesEnStock article;
	int prix;
	int prixTotal;

	public ArticlesAvecPrix(String nom, String code, int prix) {
		this.article = new ArticlesEnStock(nom, code);
		this.prix = prix;
	}

	public void ajouter(int nombre) {
		this.article.ajouter(nombre);
		this.prixTotal += (this.prix * nombre);
	}

	public String getCode() {
		return this.article.getCode();
	}

	public String getNom() {
		return this.article.getNom();
	}

	public int getQuantite() {
		return this.article.getQuantite();
	}

	public void retirer(int nombre) {
		this.article.retirer(nombre);
		this.prixTotal -= (this.prix * nombre);
	}
	
	public String toString(){
		return this.article.toString();
	}
	
	public double prixMoyen(){
		return prixTotal/this.article.getQuantite();
	}
	
	public void setPrixUnitaire(int prix){
		this.prix = prix;
	}
}
